package Dictionary;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by user on 07.01.2017.
 */
public class MainDictionary {
    public static void main(String[] args) {
        String saveLibPath = "E:\\Testing Libs\\Test1\\dictionaryLib.txt";
        Scanner in = new Scanner(System.in);
        HashMap<String, String> dictionaryPack = new HashMap<>();
        Dictionary b = new Dictionary();
/*
        // Load current Library from Dictionary Class (First Run)
        dictionaryPack.putAll(new DictionaryLib().loadDictionaryLib());
        System.out.println(dictionaryPack.values());
*/
        // Load saved Dictionary Library from PC (Run)

        dictionaryPack = b.loadDictionaryLibFromDisc(saveLibPath, dictionaryPack);
        b.enterDataFromUser(in, dictionaryPack);
    }
}

