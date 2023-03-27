package figure.triangle;

import java.util.Arrays;

public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(String name, int[] length) {
        super(name, length);
    }
    public String toString() {
        return "EquilateralTriangle{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}
