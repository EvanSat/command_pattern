
public class ExhaustFanOffCmd implements Command{
	
	ExhaustFan exhaustFan;
	
	public ExhaustFanOffCmd(ExhaustFan exhaustFan) {
		this.exhaustFan = exhaustFan;
	}

	public void execute() {
		exhaustFan.off();
	}
	
}