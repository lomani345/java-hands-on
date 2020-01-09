package section3;

import java.util.Scanner;

public class DayWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int w = sc.nextInt();
        String week[] = new String[7];
        week[0] = "satday";
        week[1] = "sunday";
        week[2] = "monday";
        week[3] = "tuesday";
        week[4] = "wedday";
        week[5] = "thusday";
        week[6] = "friday";
        System.out.println("Day of the week is " + week[w]);
        sc.close();
    }

}
