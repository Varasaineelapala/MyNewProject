package com.oops;

abstract class Notification {
	public abstract void send();
}

class SMS extends Notification {

	@Override
	public void send() {
		System.out.println("Notification from mesenges ");
	}

}

class Email extends Notification {

	@Override
	public void send() {
		System.out.println("Notification from Email ");

	}

}

class WhatsApp extends Notification {

	@Override
	public void send() {
		System.out.println("Notification from whatsApp");
	}

}

public class Notifications {
	public static void main(String[] args) {
		Notification[] notifications = { new SMS(), new Email(), new WhatsApp() };
		for (Notification n : notifications) {
			n.send();
			System.out.println("------------------------------");
		}

	}

}
