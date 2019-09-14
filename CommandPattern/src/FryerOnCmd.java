
public class FryerOnCmd implements Command {

	Fryer fryer;
	
	public FryerOnCmd(Fryer fryer) {
		this.fryer = fryer;
	}
	
	public void execute() {
		fryer.on();
	}
	
}
