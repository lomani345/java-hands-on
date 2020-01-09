package section3;

import java.util.Scanner;

public class RedCrosswhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tent = sc.nextInt();

        int[] arr = new int[tent];
        int total = 0;
        int i = 0;
        while (i < arr.length) {
            arr[i] = sc.nextInt();
            total = total + arr[i];
            i++;

        }
        System.out.println(total);
        sc.close();
    }

}
