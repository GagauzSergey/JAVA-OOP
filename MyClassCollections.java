package Collections;

import java.util.ArrayList;
import java.util.List;

import static Collections.MyClassCollections.arrayConvert;

/**
 * Created by user on 03.01.2017.
 */
public class MyClassCollections {
    public static void main(String[] args) {
        String[] arr = new String[]{"aaa", "bbb", "ccc"};
        List <String> list = new ArrayList<>();
        arrayConvert(arr, list);
        System.out.println(list);

    }
    public static void arrayConvert (String[]arr, List<String>list){
        for (int i=0; i<arr.length; i++){
         list.add(arr[i]);
        }
    }
}


