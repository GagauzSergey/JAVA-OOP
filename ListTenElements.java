package Collections;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 04.01.2017.
 */
public class ListTenElements {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"aa", "ab", "ac", "bb", "bc"};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        listOfArrays(arr1, arr2);
    }

    public static void listOfArrays(String[] arr1, int[] arr2) {
        List<Object> list = new ArrayList<>();
        for (String s : arr1) {
            list.add(s);
        }
        for (int n : arr2) {
            list.add(n);
        }
        list.remove(0);
        list.remove(0);
        list.remove(list.size()-1);
        System.out.println(list);
    }
}
