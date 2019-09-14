
public class WaffleOnCmd implements Command {

	WaffleMaker waffleMaker;
	
	public WaffleOnCmd(WaffleMaker waffleMaker) {
		this.waffleMaker = waffleMaker;
	}
	
	public void execute() {
		waffleMaker.on();
	}
	
}
