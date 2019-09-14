import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class KitchenRemoteControlTest {

	private static Light light;
	
	@BeforeClass
	public static void testSetUp() {
		light = new Light();
	}
	
	@Test
	void lightOnTest() {
		light.on();
		
		fail("Not yet implemented");
	}

}
