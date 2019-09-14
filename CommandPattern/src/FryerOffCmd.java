
public class FryerOffCmd implements Command {
	
	Fryer fryer;
	
	public FryerOffCmd(Fryer fryer) {
		this.fryer = fryer;
	}
	
	public void execute() {
		fryer.off();
	}
	
}
