package Phones;

public class Nokia3310 extends Phone {

	public Nokia3310(String number) {
		this.number=number;
		System.out.println("Nokia3310 constructor");
		screenSize = 4;
		touch = true;
		hasWifi = true;
	}

	@Override
	public void call(String number) {
		super.call(number);


  	System.out.println("Nokia3310 class is calling " + number);
			}

	@Override
	public void sendSMS(String number, String message) {
		System.out.println("Nokia3310 class is sending sms " + message + " to " + number);
	}

	@Override
	public void answere (String number){
		System.out.println("Nobody Home "+number);
	}

}
