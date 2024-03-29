package section5;

public class Square extends Shape {
    int side;

    public double calculateArea() {
        return (side * side);
    }

    public Square(int side, String shapeName) {
        super(shapeName);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}