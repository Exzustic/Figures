package figure.triangle;

import java.util.Arrays;

public final class IsoscelesTriangle extends Triangle{
    public IsoscelesTriangle(String name, int[] length) {
        super(name, length);
    }
    public String toString() {
        return "IsoscelesTriangle{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}
