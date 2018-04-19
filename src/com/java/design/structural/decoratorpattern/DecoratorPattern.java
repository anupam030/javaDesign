package com.java.design.structural.decoratorpattern;

public class DecoratorPattern {

	public static void main(String[] args) {
		
		Car sportsCar= new SportsCar(new BasicCar());
		
		sportsCar.assemble();
		
		Car SportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		
		SportsLuxuryCar.assemble();
	}

}
