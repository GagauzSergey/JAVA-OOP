package Figures;

/**
 * Created by user on 17.11.2016.
 */
public class Rectangle extends Figure{
    private  double c;
    private  double d;

    public Rectangle (){
    }

    public double getC(){
        return c;
    }

    public void setC(double c){
        this.c=c;
    }

    public double getD(){
        return d;
    }

    public void setD(double d){
        this.d=d;
    }


    @Override
    public void Square(){
        square=(c*d);
        System.out.println("Square = "+square);
    }
}

