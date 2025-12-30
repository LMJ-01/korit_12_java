package ch08_classes.products;

import ch08_classes.students.Student2;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(987654);
        Product product3 = new Product("USB-C 케이블");
        Product product4 = new Product(951753, "GFlip6");

        product1.productNum = 123456;
        product1.productName = "LG엘패드";
        product2.productName = "다이소충전기";
        product3.productNum = 159357;
        product1.showInfo();
        System.out.println();
        product2.showInfo();
        System.out.println();
        product3.showInfo();
        System.out.println();
        product4.showInfo();

    }
}
