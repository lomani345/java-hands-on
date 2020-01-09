package section6;

import java.util.Scanner;

public class CricketMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Player details of the delivery");
        System.out.println("2.Run details of the delivery");
        Integer delivery = sc.nextInt();
        Delivery detailsOfDelivery = new Delivery();
        if (delivery == 1) {
            System.out.println("Enter the bowler name");
            sc.nextLine();
            String bowler = sc.nextLine();
            System.out.println("Enter the batsman name");
            String batsman = sc.nextLine();
            System.out.println("Player details of the delivery:");
            detailsOfDelivery.displayDeliveryDetails(bowler, batsman);
        }
        if (delivery == 2) {
            System.out.println("Enter the no of runs");
            Long runs = sc.nextLong();
            detailsOfDelivery.displayDeliveryDetails(runs);
        }
        sc.close();
    }

}
