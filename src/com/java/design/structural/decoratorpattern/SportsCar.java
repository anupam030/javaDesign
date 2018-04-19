package com.java.design.structural.decoratorpattern;


?
//ConcreteDecorator which will wrap the concrete component
public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Sprts Car");
	}

}
