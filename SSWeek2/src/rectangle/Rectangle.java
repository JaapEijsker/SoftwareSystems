package rectangle;

public class Rectangle {
    
	private int length;
    private int width;
    //@ private invariant length >= 0;
    //@ private invariant width >= 0;
    
    /**
     * Create a new Rectangle with the specified length and width.
     */
    
    /*@
       requires theLength >= 0;
       requires theWidth >= 0;
       ensures this.getLength() == theLength;
       ensures this.getWidth() == theWidth;
     */
    public Rectangle(int theLength, int theWidth) {
    	length = theLength;
    	width = theWidth;
    }
    
    /**
     * The length of this Rectangle.
     */
    //@ ensures \result >= 0;
    /*@pure */ 
    public int getLength() {
	return length;
    }

    /**
     * The width of this Rectangle.
     */
    //@ ensures \result >= 0;
    /*@pure*/
    public int getWidth() {
	return width;
    }

    /**
     * The area of this Rectangle.
     */
    /*@
     ensures \result >= 0 && \result == getLength() * getWidth();
     */
    public int area() {
	return width * length;
    }

    /**
     * The perimeter of this Rectangle.
     */
    /*@
    ensures \result >= 0 && \result == 2*(getLength() + getWidth());
    */
    public int perimeter() {
	return 2*(width + length);
    }
}