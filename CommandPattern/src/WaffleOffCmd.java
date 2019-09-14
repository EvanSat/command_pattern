
public class WaffleOffCmd implements Command {

	WaffleMaker waffleMaker;
	
	public WaffleOffCmd(WaffleMaker waffleMaker) {
		this.waffleMaker = waffleMaker;
	}
	
	public void execute() {
		waffleMaker.off();
	}
	
}
