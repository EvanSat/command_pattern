
public class ExhaustFanOnCmd implements Command {
	
	ExhaustFan exhaustFan;
	
	public ExhaustFanOnCmd(ExhaustFan exhaustFan) {
		this.exhaustFan = exhaustFan;
	}

	public void execute() {
		exhaustFan.on();
	}
	
}
