package Figures;

/**
 * Created by user on 17.11.2016.
 */
public class Circle extends Figure{

    private  double rad;

    public Circle (){}

    public double getRad(){
        return rad;
    }

    public void setRad(double rad){
        this.rad=rad;
    }

    @Override
    public void Square(){
        square= Math.PI*rad*rad;
        System.out.println("Square = "+square);
    }
}
