
public class KitchenLightOffCmd implements Command{

	Light light;
	
	public KitchenLightOffCmd(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}
}