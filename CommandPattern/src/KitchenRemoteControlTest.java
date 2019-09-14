/***
 * 
 * CPSC 60000
 * Programming Assignment #2 - Factory 
 * @author Evan Sabado
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class KitchenRemoteControlTest {

	private static Light light;
	
	@BeforeClass
/*	public static void testSetUp() {
		light = new Light();
	}
*/
	
	@Test
	void lightOnTest() {
		light.on();
		
		fail("Not yet implemented");
	}

}
