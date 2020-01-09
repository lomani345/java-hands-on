package section4;

import java.util.Scanner;

public class MainConstructor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product id");
        Long id = sc.nextLong();
        System.out.println("Enter the product name");
        String productName = sc.next();
        System.out.println("Enter the supplier name");
        String supplierName = sc.next();
        ProductConstructor productprint = new ProductConstructor();
        productprint.display(id, productName, supplierName);
        sc.close();
    }

}
