package Figures;

/**
 * Created by user on 17.11.2016.
 */
public class FigMain {
    public static void main(String[] args){

        Triangle triangle =new Triangle ();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        triangle.setA(5);triangle.setH(4);triangle.Square();
        rectangle.setC(5);rectangle.setD(5);rectangle.Square();
        circle.setRad(5);circle.Square();
    }
}
