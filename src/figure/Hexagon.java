package figure;

import java.util.Arrays;

public class Hexagon extends Figure{
    public Hexagon(String name, int[] length) {
        super(name, 6, length);
    }
    @Override
    public String toString() {
        return "Hexagon{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}
