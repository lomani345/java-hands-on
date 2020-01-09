package section9;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sample Input:\n");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());

        }
        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        double average = sum / list.size();
        System.out.println("Sample Output:");
        System.out.printf("%.0f\n", sum);
        System.out.printf("%2f", average);
        sc.close();
    }

}
