package Phones;

public class MainClass {

	public static void main(String[] args) {

		PhonesList phonesList = new PhonesList();
		
		Nokia3310 nokia = new Nokia3310("123-45-50");
		System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
		nokia.sendSMS("567-78-89", "text message");

		System.out.println("----------------------------------");
		
		IPhone iphone = new IPhone("123-45-51");
		System.out.println("IPhone screent size: " + iphone.getScreenSize());
		iphone.sendSMS("567-78-89", "text message");
		
		System.out.println("----------------------------------");
		
		IPhone5 iphone5 = new IPhone5("123-45-52");
		System.out.println("IPhone screent size: " + iphone5.getScreenSize());
		iphone5.sendSMS("567-78-89", "text message");

		System.out.println("----------------------------------");

		SamsungS4 samsung = new SamsungS4("123-45-53");
		System.out.println("SamsungS4 screent size: " + samsung.getScreenSize());
		samsung.sendSMS("567-78-89", "text message");


		System.out.println("----------------------------------");
		phonesList.add(nokia);
		phonesList.add(iphone);
		phonesList.add(iphone5);
		phonesList.add(samsung);


		nokia.call("123-45-51");
	}

}
