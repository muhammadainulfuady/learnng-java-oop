package programmer.zaman.now.applications;

import programmer.zaman.now.data.Product;

public class ApplicationApp {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 30_000_000);
        System.out.println("Name        : " + product.name);
        System.out.println("Price       : " + product.price);
    }
}
