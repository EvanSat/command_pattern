
public class MixerOffCmd {
	
	Mixer mixer;
	
	public MixerOffCmd(Mixer mixer) {
		this.mixer = mixer;
	}
	
	public void execute() {
		mixer.off();
	}
	
}

