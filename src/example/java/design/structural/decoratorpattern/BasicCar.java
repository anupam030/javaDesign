package example.java.design.structural.decoratorpattern;

//ConcreteComponent
public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}

}