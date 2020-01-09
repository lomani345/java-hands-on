package section2;

import java.util.Scanner;

public class Integers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int x = sc.nextInt();
        System.out.println("enter the second number");
        int y = sc.nextInt();
        if (x < y) {
            System.out.println(+x + " is less than " + y);
        }
        if (y < x) {
            System.out.println(+x + " is greater than " + y);
        }
        if (x == y) {
            System.out.println(+x + " is equal to " + y);
        }
        sc.close();

    }

}
