package Phones;

/**
 * Created by user on 15.11.2016.
 */
public class PhonesList {
    private static Phone[] list= new Phone[5];;
    private static  int p=0;

        //метод добавления телефонов в базу
    public void add(Phone phone){
        list[p++] = phone;
    }

    //метод извлечения телефонов из базы
    public Phone get(int n) {
        return list[n];
    }

    public Phone getNumber(int n) {
        return list[n];
    }

    //метод поиска телефона в базе
    public static Phone find(String number) {
        for (int i = 0; i < p; i++) {
            if (list[i].getNumber().equalsIgnoreCase(number))
                return list[i];
        }
        return list[-1];
    }



}

