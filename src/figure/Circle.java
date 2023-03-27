package figure;

import java.util.Arrays;

public class Circle extends Figure{
    public Circle(String name, int[] length) {
        super(name, 1, length);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}
