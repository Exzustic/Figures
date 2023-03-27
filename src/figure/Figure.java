package figure;

import figure.triangle.Triangle;

import java.util.Arrays;

public class Figure {
    private String name;
    private int corners;
    private int[] length = new int[corners];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    public int[] getLength() {
        return length;
    }

    public void setLength(int[] length) {
        this.length = length;
    }

    public Figure(String name, int corners, int[] length){
        this.name = name;
        this.corners = corners;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + getName() + '\'' +
                ", corners=" + getCorners() +
                ", length=" + Arrays.toString(getLength()) +
                '}';
    }
}
