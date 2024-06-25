public class NoDiscountStrategy implements Strategy {
    @Override
    public double calculateDiscount(double total) {
        return 0;
    }
}