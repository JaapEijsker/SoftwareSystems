package threeWayLamp;


public class ThreeWayLampTest {
	
	private ThreeWayLamp testLamp1;
	
	public ThreeWayLampTest () {
		testLamp1 = new ThreeWayLamp();
	}
	
	public void runTest (){
		testInitialState();
		testChange();
	}
	
	private void testInitialState (){
		System.out.println("test: InitialState of the lamp");
		System.out.println("Initial light: " + testLamp1.getLight());
		
	}
	
	private void testChange(){
		System.out.println("test: Switching of the lamp");
		System.out.println("Starting light: " + testLamp1.getLight());
		testLamp1.switchSetting();
		System.out.println("Lamp after 1 change: " + testLamp1.getLight());
		testLamp1.switchSetting();
		System.out.println("Lamp after 2 changes: " + testLamp1.getLight());
		testLamp1.switchSetting();
		System.out.println("Lamp after 3 changes: " + testLamp1.getLight());
		testLamp1.switchSetting();
		System.out.println("Lamp after 4 changes: " + testLamp1.getLight());
		
	}
	
}
