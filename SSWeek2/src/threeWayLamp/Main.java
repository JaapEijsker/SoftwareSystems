package threeWayLamp;

public class Main {
	
	public static void main(String[] args){
		ThreeWayLampTest testLamp = new ThreeWayLampTest();
				
		testLamp.runTest();
		
		ThreeWayLampEnumTest enumTestLamp = new ThreeWayLampEnumTest();
		
		enumTestLamp.runEnumTest();
		
		long time1 =  System.currentTimeMillis();
		long time2 =  System.currentTimeMillis();
		long dtime = time2-time1;
		System.out.println(dtime);
	}

}
