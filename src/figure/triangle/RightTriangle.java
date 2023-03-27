package figure.triangle;

import java.util.Arrays;

public class RightTriangle extends Triangle{
    public RightTriangle(String name, int[] length) {
        super(name, length);
    }
    public String toString() {
        return "RightTriangle{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}
