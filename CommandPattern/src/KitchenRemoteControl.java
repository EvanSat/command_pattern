/***
 * 
 * CPSC 60000
 * Programming Assignment #3 - Command Pattern 
 * @author Evan Sabado
 *
 */

public class KitchenRemoteControl {

	static Command[] onCommands;
	static Command[] offCommands;
	
	public KitchenRemoteControl(){
		onCommands = new Command[8];
		offCommands = new Command[8];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 8; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public static void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		if (onCommands[slot] != null) {
			onCommands[slot].execute();
		}
	}
	
	public void offButtonWasPushed(int slot) {
		if (offCommands[slot] != null) {
			offCommands[slot].execute();
		}
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
