package section2;

import java.util.Scanner;

public class ProfitLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of dozens of toys purchsed");
        sc.nextFloat();
        System.out.println("Enter the price per dozen");
        float y = sc.nextFloat();
        System.out.println("Enter the selling price of 1 toy");
        float z = sc.nextFloat();
        float cp = y / 12;
        float profit = (z - cp);
        float percentage = ((profit / cp) * 100);
        System.out.println("Sam's profit percentage is" + percentage);
        sc.close();
    }

}
