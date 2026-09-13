package com.languagefundamentals;

class Computer{
	String modelName;
	double price;
Computer(String modelName,double price){
	this.modelName=modelName;
	this.price=price;
}
Computer(Computer other){
	this.modelName=other.modelName;
	this.price=other.price;
}
}
public class Processor {
	String brand;
	int cores;
	Computer computer;

	 Processor(String brand,int cores,Computer computer) {
		 this.brand=brand;
		 this.cores=cores;
		 this.computer=computer;
	}
	 Processor(Processor other) {
		 this.brand=other.brand;
		 this.cores=other.cores;
		 this.computer=new Computer(other.computer);
		}
	 void display() {
		 System.out.println("=======================");
		 System.out.println("Processor : "+brand);
		 System.out.println("Cores     : "+cores);
		 System.out.println("Model     : "+computer.modelName);
		 System.out.println("Price     : "+computer.price);
	 }

	public static void main(String[] args) {
		Computer c1=new Computer("StandardPC",800);
		
		Processor p1=new Processor("Intel",8 ,c1);
		p1.display();
		
		Processor p2=new Processor(p1);
		p2.brand="AMD";
		p2.computer.modelName="UpgradedPC";
		p2.computer.price=1200;
		p2.display();
		
		p1.display();
	}

}
