package practice2;

import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        int i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter " + n + " numbers: ");

        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (i = 0; i < (n - 1); i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted list of numbers:");

        for (i = 0; i < n; i++)
            System.out.println(a[i]);
        sc.close();

    }

}
