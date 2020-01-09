package section10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<SetOfBoxes> hs = new HashSet<SetOfBoxes>();
        System.out.println("Enter the number of Box");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the box detail %d\n", i + 1);
            System.out.println("Enter length");
            double length = sc.nextDouble();
            System.out.println("Enter width");
            double width = sc.nextDouble();
            System.out.println("Enter height");
            double height = sc.nextDouble();
            SetOfBoxes b = new SetOfBoxes(length, width, height);
            b.setVolume(length, width, height);
            hs.add(b);

        }

        System.out.println("Unique in the set order");
        for (SetOfBoxes box : hs) {
            System.out.println(box.toString());
        }
        sc.close();

    }

}
