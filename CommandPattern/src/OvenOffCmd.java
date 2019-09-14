
public class OvenOffCmd implements Command {

	Oven oven;
	
	public OvenOffCmd(Oven oven) {
		this.oven = oven;
	}
	
	public void execute() {
		oven.off();
	}
	
}