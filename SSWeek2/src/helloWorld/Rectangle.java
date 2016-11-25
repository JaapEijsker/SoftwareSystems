package helloWorld;

public class Rectangle {
	private int length;
	private int width;
	
	//@ private invariant length > 0;
	//@ private invariant width > 0;
	
	
	//@ requires theLength > 0;
	//@ requires theWidth > 0;
	//@ ensures length() == theLength;
	//@ ensures width() == theWidth;
	
	public Rectangle(int theLength, int theWidth) {
		
	}
	//@ ensures \result > 0;
	//@ pure
	public int length() {
		return length;
	}
	//@ pure
	public int width() {
		return width;
	}
	
}

