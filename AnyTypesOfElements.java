package Collections;

/**
 * Created by user on 04.01.2017.
 */
class AnyTypeOfElements {
    public static <E> Object getElement(E[] a, int num) {
        ListGeneric lis = new ListGeneric();
        lis.setArr(a);
        return lis.getArr(num);
    }
}