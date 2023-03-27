package figure.quadrilateral;

import java.util.Arrays;

public class Rectangle extends Quadrilateral {
    public Rectangle(String name, int[] length) {
        super(name, length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}