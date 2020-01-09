package section10;

public class SetOfBoxes {

    double length;
    double width;
    double height;
    double volume;

    public SetOfBoxes() {

    }

    public SetOfBoxes(double length, double width, double height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double length, double width, double height) {
        this.volume = (length * width * height);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;

        temp = Double.doubleToLongBits(volume);
        result = prime * result + (int) (temp ^ (temp >>> 32));

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SetOfBoxes other = (SetOfBoxes) obj;

        if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "length=" + length + ", width=" + width + ", height=" + height + ", volume="
                + volume;
    }

}
