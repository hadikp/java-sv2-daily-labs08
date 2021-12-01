package day01;

public class Product {

    private static int numberOfProducts; //az osztályhoz tartozik
    private String name;

    public Product(String name) {
        this.name = name;
        numberOfProducts++;
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }
}
