package exaple.java.design.behavioral.observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
	
	private float temprature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temprature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}

	@Override
	public void setSubject(Subject subject) {
		this.weatherData=subject;		
		weatherData.register(this);
	}

	@Override
	public void display() {
		System.out.println(temprature +" "+humidity+" "+pressure);		
	}

}
