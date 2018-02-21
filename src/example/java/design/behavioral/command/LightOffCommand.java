package example.java.design.behavioral.command;

//command
public class LightOffCommand implements Command {
	//reciever
	Light light;

	public LightOffCommand(Light light){
		this.light=light;
	}
	@Override
	public void execute() {
        light.off();
	}

}
