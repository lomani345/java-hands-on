package section3;

import java.util.Scanner;

public class RedCrossforeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tent = sc.nextInt();
        {
            int[] arr = new int[tent];
            int total = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int x : arr) {
                total = total + x;
            }
            System.out.println(total);

        }
        sc.close();
    }

}
