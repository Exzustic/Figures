package figure.triangle;

import figure.Figure;

import java.util.Arrays;

public class Triangle extends Figure {
    public Triangle(String name, int[] length) {
        super(name, 3, length);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}
