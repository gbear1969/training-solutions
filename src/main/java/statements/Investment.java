package statements;

public class Investment {
    private double cost = 0.003;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return (fund * interestRate * days)/100/365.0;
    }

    public double close(int days) {
        double kifizet = active ? (getFund() + getYield(days)) * (1 - cost) : 0;
        active = false;
        return kifizet;
    }
}
