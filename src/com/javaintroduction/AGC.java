package com.javaintroduction;

class AGC1 {
	AGC2 a2;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");
	}
}

class AGC2 {
	AGC1 a1;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");
	}
}

public class AGC {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");
	}

	public static void method1() {
		AGC g4 = new AGC();
	}

	public static void main(String[] args) {

		AGC g1 = new AGC();
		AGC g2 = new AGC();
		AGC g3 = new AGC();
		g1 = null; // nullifying
		g3 = g2; // reassigning
		new AGC(); // Anonymous object
		method1(); // local scope
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		AGC1 obj1 = new AGC1();
		AGC2 obj2 = new AGC2();
		obj1.a2 = obj2;
		obj2.a1 = obj1;
		obj1 = null;
		obj2 = null;

		System.gc();
		System.out.println("GC called");

	}

}
