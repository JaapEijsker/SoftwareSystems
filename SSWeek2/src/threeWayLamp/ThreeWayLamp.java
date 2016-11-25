package threeWayLamp;

public class ThreeWayLamp {
	
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MED = 2;
	public static final int HIG = 3;
	
	private int light;
	//@ private invariant light >=0 && light < 4;
	
	/*
	 * constructs a threewaylamp
	 * initial state is 'off'
	 */
	//@ ensures getLight() == 0;
	public ThreeWayLamp() {
		light = OFF;
	}
	
	/*
	 * getter to return the current light
	 */
	//@ensures \result >= 0 && \result < 4;
	/*@pure*/
	public int getLight() {
		return light;
	}
	
	/*
	 * Switches the setting of the lamp to the next setting
	 */
	//@ ensures \old(getLight() == OFF) ==> getLight() == LOW;
	//@ ensures \old(getLight() == LOW) ==> getLight() == MED;
	//@ ensures \old(getLight() == MED) ==> getLight() == HIG;
	//@ ensures \old(getLight() == HIG) ==> getLight() == MED;;

	
	public void switchSetting() {
		light = (light + 1) % 4;
	}
	
	

}
