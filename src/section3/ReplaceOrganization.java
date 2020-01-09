package section3;

import java.util.Scanner;

public class ReplaceOrganization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String s = sc.nextLine();
        System.out.println("Enter the old name of the company");
        String t = sc.nextLine();
        System.out.println("Enter the new name of the company");
        String u = sc.nextLine();
        System.out.println("the content of the modified document is");
        System.out.println(s.replace(t, u));
        sc.close();

    }
}