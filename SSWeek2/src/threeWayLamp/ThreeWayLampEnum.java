package threeWayLamp;

public class ThreeWayLampEnum {
	
//	public static final int OFF = 0;
//	public static final int LOW = 1;
//	public static final int MED = 2;
//	public static final int HIG = 3;

	public enum Light {
		OFF, LOW, MED, HIG
	}
	
	Light light;
	/*
	 * constructs a threewaylamp
	 * initial state is 'off'
	 */
	/*@pure */
	public ThreeWayLampEnum() {
		light = Light.OFF;
	}
	
	/*
	 * getter to return the current light
	 */
	
	public Light getLight() {
		return light;
	}
	
	/*
	 * Switches the setting of the lamp to the next setting
	 */
	
	public void switchSetting() {
		switch (light) {
		case OFF:
			light = Light.LOW;
			break;
		case LOW:
			light = Light.MED;
			break;
		case MED:
			light = Light.HIG;
			break;
		case HIG:
			light = Light.OFF;
		}
	}
	
	

}