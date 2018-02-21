package example.java.design.behavioral.command;

//we need to design a home remote control system having seven slots .Each slot contains two buttons one for on and one for off.
//There will be different vendor classes like Tv,CeilingFan,Light,Stereo according to that we need to implement the interfaces. 

// We can use Command pattern here .We can introduce command objects in our design .Command obejct will encapsulate a request to do
//something like turn on light on a specific object.When the button is pressed we ask the comamnd object to do some work.
/*The command pattern encapsulates a reuest by binding together a set of actions on a specific receiver.To achieve this ,it packages
the actions and the receiver up into an object that expose just one method execute().when called, execute() cause the actions to be 
invoked on the receiver.*/

public class RemoteLoader {
	
	public static void main (String args[]) {
		
		RemoteControl remoteControl = new RemoteControl();
		
		Light LivingroomLight = new Light("LivingRoomLight");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(LivingroomLight);
		
		LightOffCommand livingRoomLightOff = new LightOffCommand(LivingroomLight);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		remoteControl.onButtonWasPushed(0);
		
		remoteControl.offButtonWasPushed(0);
		
	}

}
