package section3;

import java.util.Scanner;

public class Day {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int w = sc.nextInt();

        String week[] = { "satday", "sunday", "monday", "tuesday", "wedday", "thusday", "friday" };
        System.out.println("Day of the week is " + week[w]);
        sc.close();
    }

}
