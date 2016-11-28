package Figures;
import java.util.Arrays;
/**
 * Created by user on 17.11.2016.
 */
public class FigMain {
    public static void main(String[] args){

        Triangle triangle =new Triangle (0);
        Rectangle rectangle = new Rectangle(0);
        Circle circle = new Circle(0);

        triangle.setA(5);triangle.setH(4);triangle.Square();
        rectangle.setC(5);rectangle.setD(5);rectangle.Square();
        circle.setRad(5);circle.Square();

        Figure [] list ={circle, triangle, rectangle};
        Arrays.sort(list);
        for (Figure f : list)
            System.out.println(f.getClass().getName()+"= "+f.square);
    }
   }
