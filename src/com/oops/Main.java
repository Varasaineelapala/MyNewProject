package com.oops;

class vehicle{
	int speed =50;
	void display() {
		System.out.println("Speed of the vehicle : "+speed);
	}
}
class car extends vehicle{
	int speed=100;
	@Override
	void display(){
		System.out.println("Speed of the car : "+speed);
	}
}
public class Main {
	public static void main(String[] args) {
		vehicle v1=new vehicle();
		v1.display();
		vehicle v2=new car();
		v2.display();
		car c1=new car();
		c1.display();
//		car c2=new vehicle();
		
		
		
	}

}
