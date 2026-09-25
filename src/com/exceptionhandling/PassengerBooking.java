package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

//public class PassengerBooking {
//	static int count;
//	static Scanner sc = new Scanner(System.in);
//	int passengerID;
//	int age;
//	int seatNo;
//
//	PassengerBooking() {
//	}
//
//	PassengerBooking(int passengerID, int age, int seatNo) {
//		this.passengerID = passengerID;
//		this.age = age;
//		this.seatNo = seatNo;
//	}
//
//	void display(PassengerBooking p[]) {
//		for (int i = 0; i < count; i++) {
//			System.out.println(p[i]);
//			System.out.println("------------------------------");
//		}
//	}
//
//	@Override
//	public String toString() {
//		return ("Passenger ID : " + passengerID + "\nPassenger Age : " + age + "\nSeat Number : " + seatNo);
//	}
//
//	void addPassenger(PassengerBooking p[]) {
//		System.out.print("Enter the no of passengers you want to register : ");
//		int num = sc.nextInt();
//		try {
//			for (int i = 0; i < num; i++) {
//				System.out.print("Enter the " + (i + 1) + " passenger's id : ");
//				int id = Integer.parseInt(sc.next());
//				System.out.print("Enter the " + (i + 1) + " passengers Age : ");
//				int age = Integer.parseInt(sc.next());
//				System.out.print("Enter the " + (i + 1) + " passengers seatNo : ");
//				int seatNo = Integer.parseInt(sc.next());
//				System.out.println("=======================================");
//				p[i] = new PassengerBooking(id, age, seatNo);
//				count++;
//			}
//		} catch (ArrayIndexOutOfBoundsException a) {
//			System.err.println("check the array index");
//		} catch (NumberFormatException nf) {
//			System.err.println(" Number Format Exception ");
//		}
//	}
//
//	void checkDetails(PassengerBooking p[]) {
//		try {
//			System.out.print("Enter the an index to check details : ");
//			int i = sc.nextInt();
//			System.out.println(p[i]);
//		} catch (ArrayIndexOutOfBoundsException a) {
//			System.err.println("Enter a valid index...!");
//		} catch (InputMismatchException im) {
//			System.out.println("Enter a valid input...!");
//		}
//	}
//
//	public static void main(String[] args) {
//		PassengerBooking pb = new PassengerBooking();
//		int n = 10;
//		PassengerBooking[] p = new PassengerBooking[n];
//		pb.addPassenger(p);
//		pb.display(p);
//	
//
//	}
//
//}
public class PassengerBooking {
	public static void main(String[] args) {
		String passengerIdStr = "101A";
		String ageStr = "25";
		String seatNoStr = "12B";
		int numberOfPassengers = 0;
		String[] passengerDetails = { "Anil", "tarun", "chandu" };
		Object[] mixedData = { "Anil", 25, 45.5 };
		String passengerData = null;
		int totalBaggage = 100;
		int totalAmount = 5000;
		int numberOfSeats = 0;

		try {
			int passengerId = Integer.parseInt(passengerIdStr);
			int age = Integer.parseInt(ageStr);
			System.out.println("Passenger ID: " + passengerId + ", Age: " + age);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException: Invalid ID or Age - " + e.getMessage());
		}

		try {
			int avgBaggage = totalBaggage / numberOfPassengers;
			System.out.println("Avg Baggage: " + avgBaggage);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: Cannot divide by zero for baggage");
		}

		try {
			System.out.println("Searching passenger: " + passengerDetails[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: Invalid passenger index");
		}

		try {
			char c = seatNoStr.charAt(10);
			System.out.println("Seat char: " + c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException: Invalid seat string index");
		}

		try {
			String name = (String) mixedData[1];
			System.out.println("Casted name: " + name);
		} catch (ClassCastException e) {
			System.out.println("ClassCastException: Wrong type casting in Object[]");
		}

		try {
			System.out.println("Passenger data length: " + passengerData.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: Passenger data is null");
		}

		try {
			int avgAmount = totalAmount / numberOfSeats;
			System.out.println("Avg Booking Amount: " + avgAmount);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: Cannot divide by zero for amount");
		}

		System.out.println("\nBooking process completed. Program continued after exceptions.");
	}
}
