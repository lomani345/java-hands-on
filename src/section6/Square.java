package section6;

public class Square extends Shape {
    int side;

    public double calculateArea() {
        return (side * side);
    }

    public Square(int side) {
        super();
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}
