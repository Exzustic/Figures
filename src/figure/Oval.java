package figure;

import java.util.Arrays;

public class Oval extends Figure{
    public Oval(String name, int[] length) {
        super(name, 2, length);
    }
    @Override
    public String toString() {
        return "Oval{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}
