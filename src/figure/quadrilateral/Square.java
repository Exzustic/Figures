package figure.quadrilateral;

import java.util.Arrays;

public class Square extends Quadrilateral{
    public Square(String name, int[] length) {
        super(name, length);
    }
    @Override
    public String toString() {
        return "Square{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}
