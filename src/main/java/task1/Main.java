package task1;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();
        try {
            System.out.println("\uD83D\uDD25 calculating total of an empty cart, expect an exception");
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\uD83D\uDE80 adding 2 products to the cart");
        Product product1 = new Product("Product 1", 10);
        Product product2 = new Product("Product 2", 20);
        sale.addProduct(product1);
        sale.addProduct(product2);
        System.out.println("\uD83D\uDE80 calculating total of the cart, expect 30.0");
        System.out.println(sale.calculateTotal());
    }
}
