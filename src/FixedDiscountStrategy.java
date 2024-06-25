public class FixedDiscountStrategy implements Strategy {
    private double discount;

    public FixedDiscountStrategy(double discount) {
        this.discount = discount;
    }

    @Override
    public double calculateDiscount(double total) {
        return discount;
    }
}