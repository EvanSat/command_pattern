
public class WaffleOnCmd {

	WaffleMaker waffleMaker;
	
	public WaffleOnCmd(WaffleMaker waffleMaker) {
		this.waffleMaker = waffleMaker;
	}
	
	public void execute() {
		waffleMaker.on();
	}
	
}
