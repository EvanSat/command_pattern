
public class FryerOffCmd {
	
	Fryer fryer;
	
	public FryerOffCmd(Fryer fryer) {
		this.fryer = fryer;
	}
	
	public void execute() {
		fryer.off();
	}
	
}
