package Figures;

/**
 * Created by user on 17.11.2016.
 */
public class Triangle extends Figure{
    private double h;
    private double a;

    public Triangle (double square){}


    public double getH(){
        return h;
    }

    public void setH(double h){
        this.h=h;
    }

    public double getA(){
        return a;
    }

    public void setA(double a){
        this.a=a;
    }

   @Override
    public double Square(){
       square=(a*h)/2;
       System.out.println("Square = "+square);
       return square;
    }
}
