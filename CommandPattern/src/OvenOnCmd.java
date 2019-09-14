
public class OvenOnCmd {

	Oven oven;
	
	public OvenOnCmd(Oven oven) {
		this.oven = oven;
	}
	
	public void execute() {
		oven.on();
	}
	
}
