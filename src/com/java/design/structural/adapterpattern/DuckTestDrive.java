package com.java.design.structural.adapterpattern;

public class DuckTestDrive {
	
	public static void main(String[] args){
		MallardDuck duck  = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey); // Suppose youare short onduck object;
		
		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("The duck says...");
		duck.quack();
		duck.fly();
		
		System.out.println("The Turkeyadapter says...");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}

}
