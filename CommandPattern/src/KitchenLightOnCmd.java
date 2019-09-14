
public class KitchenLightOnCmd implements Command {

	Light light;
	
	public KitchenLightOnCmd(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}
}
