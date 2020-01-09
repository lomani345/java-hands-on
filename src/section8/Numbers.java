package section8;

import java.util.Scanner;

public class Numbers {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;

        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            if (b == 0) {
                throw new DivideByZeroException();
            } else {
                c = a / b;

                System.out.println("The quotient of" + a + "/" + b + "=" + c);
            }
        } catch (DivideByZeroException ex) {
            System.out.println(ex);

        } finally {
            System.out.println("Inside finally block");
        }
        sc.close();
    }

}
