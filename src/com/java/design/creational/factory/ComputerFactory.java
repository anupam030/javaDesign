package com.java.design.creational.factory;

public class ComputerFactory {
	/*Factory design pattern is used when we have a commom interface i. produce with multiple implemtnations(Concrete Product) and 
	 * based on input, we need to return one of
     the concrete product. 
     This pattern take out the responsibility of instantiation of a class from client program to the factory class.*/
	
	/*The participants classes in this pattern are:
		Product(Computer) defines the interface for objects the factory method creates.
		ConcreteProduct(PC,Server) implements the Product interface.
		Creator(also refered as Factory because it creates the Product objects) declares the method FactoryMethod, which returns a 
		Product object. May call the generating method for creating Product objects
		ConcreteCreator overrides the generating method for creating ConcreteProduct objects*/
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
	}
}

/*Factory Design Pattern Advantages
Factory design pattern provides approach to code for interface rather than implementation.
Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more
robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware
of this.
Factory pattern provides abstraction between implementation and client classes through inheritance.*/

/*Factory Design Pattern Examples in JDK
java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
valueOf() method in wrapper classes like Boolean, Integer etc.*/