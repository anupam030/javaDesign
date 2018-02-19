package exaple.java.design.behavioral.observer;

public interface Observer {
	
	public void update(float temp,float humidity,float pressure);
	
	public void setSubject(Subject subject);

}
