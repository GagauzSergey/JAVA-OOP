package Figures;

/**
 * Created by user on 17.11.2016.
 */
public class Circle extends Figure{

    private  double rad;

    public Circle (double square){}

    public double getRad(){
        return rad;
    }

    public void setRad(double rad){
        this.rad=rad;
    }

    @Override
    public double Square(){
        square= Math.PI*rad*rad;
        System.out.println("Square = "+square);
        return square;
    }
}
