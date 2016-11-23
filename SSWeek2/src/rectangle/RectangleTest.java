package rectangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertFalse;

/**
 * Testprogram for Rectangle.
 * Lab Exercise SoftwareSystems
 * @author Jaap Eijsker, Rick Lenderink
 * 
 * 
 * dat '@Test en '@before zijn functies van JUnit dit moet ervoor om aan te geven waar het om gaat
 */
public class RectangleTest {
	
	/*
	 * maken van variabelen
	 */
	private Rectangle r1;
	private Rectangle r2;
	
	/*
	 * Dit is een setup
	 * creates twee rectangles in dit geval
	 */
	@Before
	public void setUp(){
		r1 = new Rectangle(2,3);
		r2 = new Rectangle(5,10);
	}
	/*
	 * dit is de eerste test, hier test ik de getters (i.e. getLenght)
	 */
	@Test
	public void testGetters(){
		assertEquals(2, r1.getLength());
		assertEquals(3, r1.getWidth());
		assertEquals(5, r2.getLength());
		assertEquals(10, r2.getWidth());
	}
	
	/*
	 * hier test is de oppervlakte
	 */
	@Test
	public void testArea(){
		assertEquals(2*3, r1.area());
		assertEquals(5*10,r2.area());
	}
	
	/*
	 * hier test ik de perimeter
	 */
	@Test
	public void testPerimeter(){
		assertEquals(2*(2+3),r1.perimeter());
		assertEquals(2*(5+10),r2.perimeter());
	}

}
