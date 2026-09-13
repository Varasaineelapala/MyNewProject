package com.javaintroduction;

public class TestDemo {
	static TestDemo t = new TestDemo();

	public static void methodA() {
		System.out.println("method A called");
		t.methodB();
	}

	void methodB() {
		System.out.println("method B called");
		methodC();
	}

	public static void methodC() {
		System.out.println("method C called");
		t.methodD();
	}

	void methodD() {
		System.out.println("method D called");
		methodE();
	}

	public static void methodE() {
		System.out.println("method E called");
		t.methodF();
	}

	 void methodF() {
		System.out.println("method F called");
		methodG();
	}

	public static void methodG() {
		System.out.println("method G called");
	}

	public static void main(String[] args) {
		methodA();
	}

}
