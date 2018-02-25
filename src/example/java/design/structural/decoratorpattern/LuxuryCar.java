package example.java.design.structural.decoratorpattern;

//ConcreteDecorator which will wrap the concrete component
public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Luxury Car");
	}

}
