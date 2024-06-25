public class PercentageDiscountStrategy implements Strategy {
    private double percentage;

    public PercentageDiscountStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateDiscount(double total) {
        return total * percentage / 100;
    }
}