public class Main {
    public static void main(String[] args) {
        double total = 1000;

        ShoppingCart cart = new ShoppingCart(new NoDiscountStrategy());
        System.out.println("Total with no discount: " + cart.calculateTotal(total));

        cart.setDiscountStrategy(new PercentageDiscountStrategy(10));
        System.out.println("Total with 10% discount: " + cart.calculateTotal(total));

        cart.setDiscountStrategy(new FixedDiscountStrategy(200));
        System.out.println("Total with $200 discount: " + cart.calculateTotal(total));
    }
}