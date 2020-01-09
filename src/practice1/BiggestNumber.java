package practice1;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {
        int n, big;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        big = a[0];
        for (int i = 0; i < n; i++) {
            if (big < a[i]) {
                big = a[i];
            }
        }
        System.out.println("Biggest value:" + big);
        sc.close();
    }

}
