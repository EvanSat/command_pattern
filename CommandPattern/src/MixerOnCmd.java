
public class MixerOnCmd {

	Mixer mixer;
	
	public MixerOnCmd(Mixer mixer) {
		this.mixer = mixer;
	}
	
	public void execute() {
		mixer.on();
	}
	
}
