package Phones;

//Класс Iphone

public class IPhone extends Phone {


	public IPhone(String number) {
		this.number=number;
		System.out.println("IPhone constructor");
		this.number = number;
		touch = true;
		hasWifi = true;
		screenSize = 3;
	}

		@Override
	public void call(String number) {
			super.call(number);
		System.out.println("IPhone class is calling " + number);
	}

	@Override
	public void sendSMS(String number, String message) {
		System.out.println("IPhone class is sending sms " + message + " to " + number);
	}

	@Override
	public void answere(String number) {
		System.out.println("Hello my dear friend, finally "+number);
	}


}
