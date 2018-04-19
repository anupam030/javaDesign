package com.java.design.behavioral.observer;

/*Subject contains a list of observers to notify of any change in it’s state, so it should provide methods using which observers 
 register and unregister themselves. Subject also contain a method to notify all the observers of any change and either it can 
 send the update while notifying the observer or it can provide another method to get the update.*/

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
		currentDisplay.setSubject(weatherData);
		
		weatherData.setMeasurements(10, 12, 14);

	}

}
