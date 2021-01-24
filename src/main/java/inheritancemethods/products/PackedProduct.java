package inheritancemethods.products;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product {
    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    public BigDecimal weightOfPacking(int pieces) {
        return weightOfBox.multiply(new BigDecimal(String.valueOf(pieces / packingUnit + Math.signum(pieces % packingUnit))));
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        return super.totalWeight(pieces).add(weightOfPacking(pieces));
    }
}
