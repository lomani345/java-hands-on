package section3;

import java.util.Scanner;

public class SecureUrl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String web = sc.nextLine();
        System.out.println("Enter the string ");
        String website = sc.nextLine();
        if (website.matches("[t]{2}[h][p][s]") && web.startsWith("https")) {
            System.out.println(web + "start with https");
        } else {
            System.out.println(web + " does not start with\" https\"");
        }
        sc.close();

    }
}
