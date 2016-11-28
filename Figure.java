package Figures;

/**
 * Created by user on 17.11.2016.
 */
abstract class Figure implements Comparable{

    public double square;

    public abstract double Square();

    @Override
    public int compareTo(Object another) {
        Figure f = (Figure) another;
        if (square > f.square)
            return -1;
        else if (square == f.square)
            return 0;
        else if (square < f.square)
            return 1;
        else
            return 0;
    }
}
