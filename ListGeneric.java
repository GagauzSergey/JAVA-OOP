package Collections;

/**
 * Created by user on 04.01.2017.
 */
class ListGeneric<E> {
    private E[] arr;

    public void setArr(E[] arr) {
        this.arr = arr;
    }

    public E getArr(int id) {
        return arr[id];
    }
}