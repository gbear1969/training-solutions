package introinheritance.basket;

public class ShoppingBasketGA {
    private Basket basket = new Basket();

    public void addItem(Item item) {
        basket.addItem(item);
    }

    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }

    public double sumNettoPrice() {
        double sum = 0.0;
        for (Item i: basket.getItems()) {
            sum += i.getNettoPrice();
        }
        return sum;
    } // az összes tételre

    public double sumTaxValue() {
        double sum = 0.0;
        for (Item i: basket.getItems()) {
            sum += i.getTaxAmount();
        }
        return sum;
    }  // az összes tételre

    public double sumBruttoPrice() {
        return sumNettoPrice() + sumTaxValue();
    }

    public void checkout() {
        basket.clearBasket();
    } // befejezzük a vásárlást, a kosár ürítése

    public void removeMostExpensiveItem() {
        Item rem = basket.getItems().get(0);
        for (int i = 1; i < basket.getItems().size(); i++) {
            if (basket.getItems().get(i).getNettoPrice() > rem.getNettoPrice()) {
                rem = basket.getItems().get(i);
            }
        }

        removeItem(rem.getBarcode());
    } // kikeresi és eltávolítja a kosárból a legdrágább tételt
}
