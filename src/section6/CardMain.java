package section6;

import java.util.Scanner;

public class CardMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Card ");
        System.out.println("1.Payback Card\n2.Membership Card ");
        int ch = sc.nextInt();
        sc.nextLine();
        PaybackCard p[] = new PaybackCard[3];
        MembershipCard m[] = new MembershipCard[3];
        if (ch == 1) {
            System.out.println("Enter the card details:");
            String val[] = sc.nextLine().split("\\|");
            System.out.println("Enter points in Card ");
            int pointsEarned = sc.nextInt();
            System.out.println("Enter Amount");
            double totalAmount = sc.nextDouble();
            for (int i = 0; i < 3; i++) {
                p[i] = new PaybackCard(val[0], val[1], val[2], pointsEarned, totalAmount);

            }
            System.out.println(val[0] + "'s Payback Card Details:");
            System.out.println("Card Number" + val[1]);
            System.out.println("Points earned" + pointsEarned);
            System.out.println("Total Amount" + totalAmount);
        }

        if (ch == 2) {
            System.out.println("Enter the card details:");
            String val[] = sc.nextLine().split("\\|");
            System.out.println("Enter rating in card");
            int rating = sc.nextInt();
            for (int i = 0; i < 3; i++) {
                m[i] = new MembershipCard(val[0], val[1], val[2], rating);

            }
            System.out.println(val[0] + "'s Membership Card Details:");
            System.out.println("Card Number" + val[1]);
            System.out.println("rating" + rating);
        }

        sc.close();

    }

}
