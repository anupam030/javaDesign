package com.java.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/*We are going to build a weather monitoring system where weather data will provide temperature ,humidity and pressure and three types
 of weather display will monitor the weather data and display it many other display can also be created from it.*/

/*Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated 
automatically.
*/

/*Subject contains a list of observers to notify of any change in it’s state, so it should provide methods using which observers 
register and unregister themselves. Subject also contain a method to notify all the observers of any change and either it can 
send the update while notifying the observer or it can provide another method to get the update.*/

public class WeatherData implements Subject {
	
	List<Observer> observers;
	private float temprature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer obj) {
		observers.add(obj);		
	}

	@Override
	public void unregister(Observer obj) {
		observers.remove(obj);	
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temprature,humidity,pressure);
		}
		
	}
	
	public void setMeasurements(float temp,float humidity,float pressure) {
		this.temprature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		mesaurementsChanged();	
	}

	private void mesaurementsChanged() {
		notifyObservers();
	}

}
