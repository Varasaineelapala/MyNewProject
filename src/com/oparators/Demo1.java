package com.oparators;
class Demo2{
	static {
		System.out.println("parent static");
	}
	{
		System.out.println("parent instance");
	}
	Demo2(){
		System.out.println("parenrt constructor");
	}
}
public class Demo1 extends Demo2{
	static {
		System.out.println("child static");
	}
	{
		System.out.println("child instance");
	}
	Demo1(){
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		Demo1 d=new Demo1(); 
	}

}
