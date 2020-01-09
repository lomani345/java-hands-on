package section8;

import java.util.Scanner;

public class AgeValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        try {
            if (age >= 18) {
                System.out.println("welcome to vote ");

            } else {
                throw new InvalidAgeException();
            }
        } catch (InvalidAgeException ex) {
            System.out.println(ex);

        }

        finally {
            sc.close();
        }

    }
}