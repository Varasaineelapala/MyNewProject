
package com.javaintroduction;

public class ObjecCounter {
	static int counter;
	{
		counter++ ;
	}
	public static void main(String[] args) {
	  new ObjecCounter();
	  new ObjecCounter();
	  new ObjecCounter();
	  new ObjecCounter();
	  new ObjecCounter();
	  System.out.println("Number of Objects Created:" +counter);
	  
	  Object obj=10;
	  System.out.println(obj instanceof Number);
	  System.out.println(obj instanceof Integer);

	}

}
