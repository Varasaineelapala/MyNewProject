//1.Create a class with an instance block
//that initializes variables and an instance
//method that performs addition on
//int, float, and double data types.
package com.javaintroduction;

//import com.jdbc.in1;

//public class TestDemo2 {
//	int a, b;
//	float c, d;
//	double e, f;
//	{
//		a = 10;
//		b = 15;
//		c = 20.56f;
//		d = 25.87f;
//		e = 30.89d;
//		f = 35.54d;
//	}
//
//	void add() {
//		System.out.println(a + b);
//		System.out.println(c + d);
//		System.out.println(e + f);
//	}
//
//	public static void main(String[] args) {
//		TestDemo2 t1 = new TestDemo2();
//		t1.add();
//	}


interface in1{
	public void method();

}

   public class TestDemo2{

	public static void main(String[] args) {

		in1 i= () -> {
			System.out.println("first program from java 8 features");
		};

		i.method();

	}

}


