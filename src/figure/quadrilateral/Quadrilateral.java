package figure.quadrilateral;

import figure.Figure;

import java.util.Arrays;

public class Quadrilateral extends Figure {
    public Quadrilateral(String name, int[] length) {
        super(name, 4, length);
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}