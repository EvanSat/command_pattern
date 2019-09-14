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
		Fryer fryer = new Fryer();
		ExhaustFan exhaustFan = new ExhaustFan();
		
		KitchenLightOnCmd kitchenLightOn = new KitchenLightOnCmd(kitchenLight);
		KitchenLightOffCmd kitchenLightOff = new KitchenLightOffCmd(kitchenLight);
		OvenOnCmd ovenOn = new OvenOnCmd(oven);
		OvenOffCmd ovenOff = new OvenOffCmd(oven);
		MixerOnCmd mixerOn = new MixerOnCmd(mixer);
		MixerOffCmd mixerOff = new MixerOffCmd(mixer);
		WaffleOnCmd WaffleMakerOn = new WaffleOnCmd(waffleMaker);
		WaffleOffCmd WaffleMakerOff = new WaffleOffCmd(waffleMaker);
		FryerOnCmd fryerOn = new FryerOnCmd(fryer);
		FryerOffCmd fryerOff = new FryerOffCmd(fryer);
		ExhaustFanOnCmd exhaustFanOn = new ExhaustFanOnCmd(exhaustFan);
		ExhaustFanOffCmd exhaustFanOff = new ExhaustFanOffCmd(exhaustFan);
		
		KitchenRemoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
		KitchenRemoteControl.setCommand(1, ovenOn, ovenOff);
		KitchenRemoteControl.setCommand(2, mixerOn, mixerOff);
		KitchenRemoteControl.setCommand(3, WaffleMakerOn, WaffleMakerOff);
		KitchenRemoteControl.setCommand(4, fryerOn, fryerOff);
		KitchenRemoteControl.setCommand(5, exhaustFanOn, exhaustFanOff);
		
		/*
		KitchenRemoteControl test = new KitchenRemoteControl();
		String result = test.onButtonWasPushed(2);
		assertEquals("Turn on lights", result);
		
		
		private void method1(KitchenRemoteControl[1]) {
			if ()
		}
		*/
		// Unknown how to utilize Junit to test for void methods
		String result = KitchenRemoteControl.onButtonWasPushed(0);
		
		
		fail("Not yet implemented");
	}


}
