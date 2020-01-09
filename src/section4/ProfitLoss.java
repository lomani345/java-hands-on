package section4;

import java.util.Scanner;

public class ProfitLoss {
    static int dozenCount;
    static int priceperDozen;
    static int sellPrice;
    static float profitPercentage;
    static int x;
    static int y;
    static float z;
    static float profit;
    static int cp;
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the no of dozens of toys purchased");
        x = sc.nextInt();
        System.out.println("Enter price per dozen");
        y = sc.nextInt();
        System.out.println("Enter selling price");
        z = sc.nextFloat();
        calculateprofit();
        System.out.println("sam has" + profitPercentage);

    }

    public static float calculateprofit() {
        cp = (y / 12);
        profit = (z - cp);
        profitPercentage = ((profit / cp) * 100);
        return profitPercentage;

    }

    public float calculateProfit1(int dozenCount, int priceperdozen, int sellPrice) {
        ProfitLoss.dozenCount = dozenCount;
        ProfitLoss.dozenCount = priceperDozen;
        ProfitLoss.sellPrice = sellPrice;
        return profitPercentage;
    }
}