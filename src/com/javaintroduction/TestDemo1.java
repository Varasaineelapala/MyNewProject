package com.javaintroduction;

public class TestDemo1 {
	static TestDemo1 t=new TestDemo1();
	public static void method1() {
		System.out.println("method 1 called");
		method3();
	}
	void method2() {
	System.out.println("method 2 called");
		method4();
	}
	public static void method3() {
		System.out.println("method 3 called");
		t.method2();
	}
	void method4() {
		System.out.println("method 4 called");
	}

	public static void main(String[] args) {
		method1();

	}

}
