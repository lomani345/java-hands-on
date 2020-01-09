package section6;

public class Hexagone extends Shape {
    int side1;

    double calculateArea() {
        return 0;
    }

    public Hexagone(int side1) {
        super();
        this.side1 = side1;
    }

    public int getSide() {
        return side1;
    }

    public void setSide(int side1) {
        this.side1 = side1;
    }

}
