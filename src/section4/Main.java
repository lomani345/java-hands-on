package section4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product id");
        Long id = sc.nextLong();
        System.out.println("Enter the product name");
        String productName = sc.next();
        System.out.println("Enter the supplier name");
        String supplierName = sc.next();
        Product productDetails = new Product();
        productDetails.setId(id);
        productDetails.setProductName(productName);
        productDetails.setSupplierName(supplierName);
        System.out.println("Product Id is " + productDetails.getId());
        System.out.println("Product Name is " + productDetails.getProductName());
        System.out.println("Supplier Name is 1" + productDetails.getSupplierName());
        sc.close();

    }

}
