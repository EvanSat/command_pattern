/***
 * 
 * CPSC 60000
 * Programming Assignment #2 - Factory 
 * @author Evan Sabado
 *
 */

import static org.junit.jupiter.api.Assertions.*;

///import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class KitchenRemoteControlTest {

///	private static Light light;
	
///	@BeforeClass
/*	public static void testSetUp() {
		light = new Light();
	}
*/
	
	@Test
	public void lightOnTest() {
		Light kitchenLight = new Light();
		Oven oven = new Oven();
		Mixer mixer = new Mixer();
		WaffleMaker waffleMaker = new WaffleMaker();
		Fryer fryer = Fryer();
		ExhaustFan exhaustFan = ExhaustFan();
		
		
		
		KitchenRemoteControl test = new KitchenRemoteControl();
		String result = test.onButtonWasPushed(2);
		assertEquals("Turn on lights", result);
		
		
		fail("Not yet implemented");
	}


}
