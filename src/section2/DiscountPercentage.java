package section2;

import java.util.Scanner;

public class DiscountPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Price of item1");
        float x = sc.nextFloat();
        System.out.println("Price of item2");
        float y = sc.nextFloat();
        System.out.println("Discount in percentage");
        int z = sc.nextInt();
        float total = x + y;
        int amt = 100 - z;
        float discount = (amt * total) / 100;
        float saved = total - discount;
        System.out.println("Total amount:$" + total);
        System.out.println("Discount amount:$" + discount);
        System.out.println("Saved amount:$" + saved);
        sc.close();

    }
}