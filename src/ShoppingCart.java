public class ShoppingCart {
    private Strategy discountStrategy;

    public ShoppingCart(Strategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(Strategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(double total) {
        double discount = discountStrategy.calculateDiscount(total);
        return total - discount;
    }
}