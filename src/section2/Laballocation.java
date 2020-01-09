package section2;

import java.util.Scanner;

public class Laballocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
        int L1 = sc.nextInt();
        System.out.println("enter y");
        int L2 = sc.nextInt();
        System.out.println("enter z");
        int L3 = sc.nextInt();
        if (L1 < L2 && L1 < L3) {
            System.out.println("L1 has minimal seating capacity");
        }
        if (L2 < L1 && L2 < L3) {
            System.out.println("L2 has minimal seating capacity");
        }
        if (L3 < L1 && L3 < L2) {
            System.out.println("L3 has minimal seating capacity");
        }
        sc.close();
    }
}