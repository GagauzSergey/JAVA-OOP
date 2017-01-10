package Dictionary;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by user on 07.01.2017.
 */
public class Dictionary {

    private String englishWord;
    private String russianWord;
    private String russianSenTranslate;
    private String russianWordTranslate;
    Scanner in = new Scanner(System.in);

    public Dictionary(String russianWord, String englishWord) {
        this.russianWord = russianWord;
        this.englishWord = englishWord;
    }

    public Dictionary() {
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getRussianWord() {
        return russianWord;
    }

    public void setRussianWord(String russianWord) {
        this.russianWord = russianWord;
    }

    /*
    * Word translation
    * */
    public void translateEngRusWord(String russianWordTranslate, HashMap<String, String> dictionaryPack) {
        this.russianWordTranslate = russianWordTranslate;

        if ((dictionaryPack.containsKey(russianWordTranslate))) {
            System.out.println(dictionaryPack.get(russianWordTranslate));
        } else {
            System.out.println("Not found!");
            answereAddWord(in, russianWordTranslate, dictionaryPack);
        }
    }

    /*
    * Sentence translation
    **/
    public void translateEngRusSentence(String russianSenTranslate, HashMap<String, String> dictionaryPack) {
        this.russianSenTranslate = russianSenTranslate;
        String[] russianSentencelatePack;
        String sentenceResult = "";
        russianSentencelatePack = russianSenTranslate.split(" ");
        for (int i = 0; i < russianSentencelatePack.length; i++) {
            if (dictionaryPack.containsKey(russianSentencelatePack[i])) {
                sentenceResult += dictionaryPack.get(russianSentencelatePack[i]) + " ";
            }
        }
        System.out.println(sentenceResult);
    }

    /*
    * New unknown word adding to Dictionary Library;
    * */
    public void answereAddWord(Scanner in, String russianWordTranslate, HashMap<String, String> dictionaryPack) {
        String answereYes = "y";
        String answereNo = "n";
        String userAnswere;
        String newUserWordTranslate;

        System.out.println("Do you want to add this word to library?");
        System.out.println("Enter <y> if you want and <n> if you don't:");
        userAnswere = in.nextLine();

        if (userAnswere.equalsIgnoreCase(answereYes)) {
            System.out.println("Enter translation of word - <" + russianWordTranslate + ">");
            newUserWordTranslate = in.nextLine();
            new DictionaryLib().addToDictionaryLib(russianWordTranslate, newUserWordTranslate, dictionaryPack);
        } else {
            System.out.println("Thank you, you should try to find another word");
            enterDataFromUser(in, dictionaryPack);
        }
    }

    /*
    * Dictionary saving from PC HD
    * */
    public HashMap<String, String> loadDictionaryLibFromDisc(String saveLibPath, HashMap<String, String> dictionaryPack) {

        try {
            FileInputStream fio2 = new FileInputStream(saveLibPath);
            ObjectInputStream ois2 = new ObjectInputStream(fio2);

            dictionaryPack = (HashMap<String, String>) ois2.readObject();
            System.out.println(dictionaryPack.values());

            fio2.close();
            ois2.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dictionaryPack;
    }

    /*
    * Entering any data (words or sentences) from user
    * */
    public void enterDataFromUser(Scanner in, HashMap<String, String> dictionaryPack) {
        String userType;
        System.out.println("Welcome, type you sentence or word:");
        userType = in.nextLine();
        String[] userTypeArr = userType.split(" ");
        if (userTypeArr.length > 1) {
            translateEngRusSentence(userType, dictionaryPack);
        } else {
            translateEngRusWord(userType, dictionaryPack);
        }
    }
}