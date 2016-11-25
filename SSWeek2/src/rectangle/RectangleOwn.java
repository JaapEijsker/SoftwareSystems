package rectangle;

public class RectangleOwn {
    private int length;
    private int width;

    /* @ requires theLength >= 0 && theWidth >= 0;
     	 ensures length() == length && width() == width;
     * 
     * 
     */
    public RectangleOwn(int theLength, int theWidth) {
    	length = theLength;
    	width = theWidth;
    }
    
    
    //@ ensures \result >= 0;
    //@ pure
    public int length() {
	return length;
    }

    //@ ensures \result >= 0;
    //@ pure
    public int width() {
	return width;
    }
    
    //@ ensures \result >= 0 && \result == length() * width();
    public int area() {
	return length * width;
    }
    
    //@ ensures \result >= 0 && \result == 2 * (length() + width() );
    public int perimeter() {
	return 2 * (length + width);
    }
}