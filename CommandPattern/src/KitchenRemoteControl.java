/***
 * 
 * CPSC 60000
 * Programming Assignment #3 - Command Pattern 
 * @author Evan Sabado
 *
 */

public class KitchenRemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	
	public KitchenRemoteControl(){
		onCommands = new Command[8];
		offCommands = new Command[8];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 8; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n--------- Kitchen Remote Control ---------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
			+ "     " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
		
}
