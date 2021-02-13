package exceptions.polinom;

public class Polynomial {
    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        if (coefficients == null) {
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;
    }

    public Polynomial(String[] coeffitientsString) {
        if (coeffitientsString == null) {
            throw new NullPointerException("coefficientStrs is null");
        }
        try {
            this.coefficients = converter(coeffitientsString);
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", iae);
        }
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    private double[] converter(String[] coeffitientsString) {
        double[] result = new double[coeffitientsString.length];
        for (int i = 0; i < coeffitientsString.length; i++) {
            result[i] = Double.parseDouble(coeffitientsString[i]);
        }
        return result;
    }

    public double evaluate(double x) {
        double value = 0;
        for (int i = coefficients.length - 1; i >= 0; i--) {
            value += coefficients[i] * Math.pow(x, coefficients.length - 1 - i);
        }
        return value;
    }
}
