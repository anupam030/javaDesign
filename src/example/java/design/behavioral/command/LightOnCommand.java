package example.java.design.behavioral.command;

//command
public class LightOnCommand implements Command {	
	//reciever
	Light light;

	public LightOnCommand(Light light){
		this.light=light;
	}
	@Override
	public void execute() {
        light.on();
	}

}
