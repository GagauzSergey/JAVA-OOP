package Phones;

//Класс Iphone5

public class IPhone5 extends IPhone {
	
	public IPhone5(String number) {
		super(number);
		System.out.println("IPhone5 constructor");
		screenSize = 4;
		touch = true;
		hasWifi = true;
	}

	PhonesList phonesList = new PhonesList();

	@Override
	public void call(String number) {
		super.call(number);
    	System.out.println(number);
	}

	@Override
	public void sendSMS(String number, String message) {
		super.sendSMS(number, message);
		System.out.println("IPhone5 class is sending sms " + message + " to " + number);	
	}
	@Override
	public void answere (String number){
		System.out.println("Hello Hello "+number);
	}
}
