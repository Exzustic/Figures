package figure;

import java.util.Arrays;

public class Pentagon extends Figure{
    public Pentagon(String name,int[] length) {
        super(name, 5, length);
    }
    @Override
    public String toString() {
        return "Pentagon{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}
