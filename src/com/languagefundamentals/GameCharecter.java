package com.languagefundamentals;

public class GameCharecter {
	String characterName;
	String classType;
	int healthPoints;
	int attackPower;
	
	GameCharecter(String characterName,String classType,int healthPoints,int attackPower){
		this.characterName=characterName;
		this.classType=classType;
		this.healthPoints=healthPoints;
		this.attackPower=attackPower;
		
	}
	GameCharecter(GameCharecter gc){
		this.characterName=gc.characterName;
		this.classType=gc.classType;
		this.healthPoints=gc.healthPoints;
		this.attackPower=gc.attackPower;
		
	}
	void display() {
		System.out.println("*************/STATS/************");
		System.out.println("Character Name : "+characterName);
		System.out.println("Class Type     : "+classType);
		System.out.println("Health         : "+healthPoints);
		System.out.println("Attack Power   : "+attackPower);
		
	}
	void takeDamage(int damageAmount) {
		healthPoints=healthPoints-damageAmount;
	}

	void boostAttack() {
		attackPower=attackPower+15;
	}

	public static void main(String[] args) {
		GameCharecter gc1=new GameCharecter("Victor","Soldier",100,25);
		gc1.display();
		
		GameCharecter gc2=new GameCharecter(gc1);
		gc2.takeDamage(35);
		gc2.boostAttack();
		gc2.display();
		
		

	}

}
