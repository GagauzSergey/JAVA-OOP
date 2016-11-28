package Figures;
import java.util.Comparator;
/**
 * Created by user on 26.11.2016.
 */
class FigureComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Figure h1 = (Figure) o1;
        Figure h2 = (Figure) o2;
        if (h1.Square() < h2.Square())
            return -1;
        else if (h1.Square() == h2.Square())
            return 0;
        else if (h1.Square() > h2.Square())
            return 1;
        return 0;
    }
}
