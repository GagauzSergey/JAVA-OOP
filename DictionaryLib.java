package Dictionary;

import java.io.*;
import java.util.HashMap;

/**
 * Created by user on 07.01.2017.
 */
public class DictionaryLib implements Serializable {

    private static final long serialVersionUID = 1L;
    String russianWord;
    String englishWord;
    String saveLibPath = "E:\\Testing Libs\\Test1\\dictionaryLib.txt";
    FileOutputStream fos1;
    ObjectOutputStream oos1;
    HashMap<String, String> library = new HashMap<>();

    String s1 = "дом";
    String s2 = "home";

    String s3 = "семья";
    String s4 = "family";

    String s5 = "работа";
    String s6 = "work";

    String s7 = "поездка";
    String s8 = "travel";

    String s9 = "музыка";
    String s10 = "music";

    String s11 = "мяч";
    String s12 = "ball";

    String s13 = "игра";
    String s14 = "game";

    public DictionaryLib() {
    }

    /*
    * First start data adding to Dictionary
    * */
    public HashMap<String, String> loadDictionaryLib() {
        library.put(s1, s2);
        library.put(s3, s4);
        library.put(s5, s6);
        library.put(s7, s8);
        library.put(s9, s10);
        library.put(s11, s12);
        library.put(s13, s14);
        System.out.println(library.values());
        return library;
    }

    /*
    * New Word adding to Dictionary Library on PC HD;
    * */
    public void addToDictionaryLib(String russianWord, String englishWord, HashMap<String, String> library) {
        this.library = library;
        this.russianWord = russianWord;
        this.englishWord = englishWord;
        library.put(russianWord, englishWord);
        System.out.println("Well, Done!");
        System.out.println(library.values());
        try {
            fos1 = new FileOutputStream(saveLibPath);
            oos1 = new ObjectOutputStream(fos1);
            oos1.writeObject(library);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos1.close();
                oos1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
