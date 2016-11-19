package Phones;

/**
 * Created by user on 15.11.2016.
 * класс SamsungS4
 */

public class SamsungS4 extends Phone{
    public SamsungS4(String number) {
        System.out.println("SamsungS4 constructor");
        this.number=number;
        touch = true;
        hasWifi = true;
        screenSize = 5;
    }

    @Override
    public void call(String number) {
        super.call(number);
     System.out.println("SamsungS4 class is calling " + number);

    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Hello, "+"SamsungS4 class is sending sms " + message + " to " + number);
    }

    @Override
    public void answere (String number){
        System.out.println("Call back from "+number);
    }

}


