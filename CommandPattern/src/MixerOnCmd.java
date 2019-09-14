
public class MixerOnCmd implements Command {

	Mixer mixer;
	
	public MixerOnCmd(Mixer mixer) {
		this.mixer = mixer;
	}
	
	public void execute() {
		mixer.on();
	}
	
}
