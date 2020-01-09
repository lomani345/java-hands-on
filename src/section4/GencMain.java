package section4;

import java.util.Scanner;

public class GencMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of GenCs ");
        int n = sc.nextInt();
        Trainee t[] = new Trainee[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Trainee();
            System.out.println("Enter Employee Id");
            int empId = sc.nextInt();
            sc.nextLine();
            t[i].setEmployeeId(empId);
            System.out.println("Enter name");
            String name = sc.nextLine();
            t[i].setName(name);

        }
        Trainee tr = new Trainee();
        tr.display(t);
        sc.close();

    }

}
