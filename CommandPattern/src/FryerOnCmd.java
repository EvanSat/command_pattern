
public class FryerOnCmd {

	Fryer fryer;
	
	public FryerOnCmd(Fryer fryer) {
		this.fryer = fryer;
	}
	
	public void execute() {
		fryer.on();
	}
	
}
