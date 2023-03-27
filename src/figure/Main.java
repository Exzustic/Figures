package figure;

import figure.quadrilateral.Rectangle;
import figure.quadrilateral.Square;
import figure.triangle.EquilateralTriangle;
import figure.triangle.IsoscelesTriangle;
import figure.triangle.RightTriangle;
import figure.triangle.Triangle;
import figure.quadrilateral.Quadrilateral;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Figure> list = new ArrayList<>();
    public static void main(String[] args) {
        add("X",1,sort(new int[]{5}));
        add("XO",2,sort(new int[]{3,3}));
        look();
    }
    static void add(String name, int corners,int[] length){
        switch (corners){
            case 1 -> list.add(new Circle(name,length));
            case 2 -> {
                if (length[0] == length[1]){
                    int[] l= new int[1];
                    l[0] = length[0];
                    list.add(new Circle(name,l));
                }
                else
                    list.add(new Oval(name, length));
            }
            case 3 -> {
                if((Math.pow(length[0],2) + Math.pow(length[1],2)) == Math.pow(length[2],2))
                    list.add(new RightTriangle(name,length));
                else if(length[0] == length[1] && length[1] == length[2])
                    list.add(new EquilateralTriangle(name,length));
                else if(length[0] == length[1] || length[1] == length[2])
                    list.add(new IsoscelesTriangle(name,length));
                else
                    list.add(new Triangle(name,length));
            }
            case 4 -> {
                if(length[0] == length[3])
                    list.add(new Square(name,length));
                else if(length[0] == length[1] && length[2] == length[3])
                    list.add(new Rectangle(name,length));
                else
                 list.add(new Quadrilateral(name, length));
            }
            case 5 -> list.add(new Pentagon(name,length));
            case 6 -> list.add(new Hexagon(name,length));
            default -> list.add(new Figure(name, corners, length));
        }
    }
    static void look(){
        for (Figure figure : list) {
            System.out.println(figure);
            System.out.println("-----------");
        }
    }
    static int[] sort(int[] length){
        Arrays.sort(length);
        return length;
    }
}