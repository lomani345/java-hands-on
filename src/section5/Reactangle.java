package section5;

public class Reactangle extends Shape {
    int length;
    int breadth;

    public double calculateArea() {
        return (length * breadth);
    }

    public Reactangle(int length, int breadth, String shapeName) {
        super(shapeName);
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

}
