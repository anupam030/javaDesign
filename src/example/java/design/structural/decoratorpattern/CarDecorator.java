package example.java.design.structural.decoratorpattern;

// Better example Starbucks coffe system 
//Adding behaviour in the object at truntimr
//Classes should be open or extension but closed for modification
//Decorator
public class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car c){
		this.car=c;
	}
	
	@Override
	public void assemble() {
		this.car.assemble();
	}

}