
package example.java.design.behavioral.command;

//reciever
public class Light {
	
	String room ;
	
	public Light(String room) {
		this.room=room;
	}
	
	public void on() {
		System.out.println(room+" "+"Light On");
	}
	
	public void off() {
		System.out.println(room+" "+"Light Off");	
	}

}
