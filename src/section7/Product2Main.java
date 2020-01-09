package section7;

import java.util.Scanner;

public class Product2Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product id");
        Long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter product name");
        String productName = sc.nextLine();
        System.out.println("Enter supplier name");
        String supplierName = sc.nextLine();

        Product2 p = new Product2(id, productName, supplierName);
        System.out.println(id + ":" + productName + ":" + supplierName);
        System.out.println("Invoking getClass() method" + p.getClass().getName());
        sc.close();

    }

}
