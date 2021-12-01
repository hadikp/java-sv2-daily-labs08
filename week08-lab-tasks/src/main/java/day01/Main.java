package day01;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("cipő");
        System.out.println(product.getNumberOfProducts());
        System.out.println(Product.getNumberOfProducts());

        Product product1 = new Product("körte");
        System.out.println(product1.getNumberOfProducts());
    }
}
