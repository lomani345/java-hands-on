package section6;

import java.util.Scanner;

import section5.Circle;
import section5.Reactangle;
import section5.Square;

public class ShapeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Reactangle\n2.Square\3.Circle\4.Hexagone");
        System.out.println("Area Calculator---Choose your shape");
        int Choice = sc.nextInt();

        switch (Choice) {
        case 1:
            System.out.println("Enter length and breadth");
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            Reactangle r = new Reactangle(length, breadth, "Reactangle");
            System.out.printf("Area of Reactangle is:%2f", r.calculateArea());
            break;

        case 2:
            System.out.println("Enter side");
            int side = sc.nextInt();
            Square s = new Square(side, "Square");
            System.out.printf("Area of Squares is:%2f", s.calculateArea());
            break;
        case 3:
            System.out.println("Enter Radius");
            int radius = sc.nextInt();
            Circle c = new Circle(radius, "Circle");
            System.out.printf("Area of Circle is:%2f", c.calculateArea());
        case 4:
            System.out.println("Enter hexagoneSide");
            int side1 = sc.nextInt();
            Hexagone h = new Hexagone(side1);
            System.out.printf("Area of Circle is:%2f", h.calculateArea());

        default:
            System.out.println("Choose an appropriate number");
        }
        sc.close();
    }
}