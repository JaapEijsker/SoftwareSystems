package test;

import hotel.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SafeTest {

	private Safe safe1;
	private Safe safe2;
	
	@Before
	public void setUp(){
		safe1 = new Safe("password");
		safe2 = new Safe("1234");
		safe1.activate("password");
		safe2.activate("1234");
	}
	
	
	@Test
	public void testActiveCorrect(){
		assertTrue(safe1.getActive());
		assertTrue(safe2.getActive());
		safe1.open("password");
		assertTrue(safe1.getOpen());
		safe1.deactivate();
		assertFalse(safe1.getActive());
		assertFalse(safe1.getOpen());
		safe1.activate("password");
		assertFalse(safe1.activate("password"));
	}
		
	@Test
	public void testPassCorrect() {
		assertTrue(safe1.getPassword().testWord("password"));
		assertFalse(safe2.getPassword().testWord("password"));
		assertTrue(safe1.getPassword().testWord("password"));
	}
	
	@Test
	public void testOpen(){
		safe2.deactivate();
		safe2.open("1234");
		assertFalse(safe2.getOpen());
		safe2.activate("1234");
		safe2.open("1234");
		assertTrue(safe2.getOpen());
	}
	
	@Test
	public void testClosedAndDeact(){
		safe2.open("1234");
		assertTrue(safe2.getOpen());
		safe2.close();
		assertFalse(safe2.getOpen());
		assertFalse(safe2.close());
		safe2.open("1234");
		assertTrue(safe2.getOpen());
		safe2.deactivate();
		assertFalse(safe2.getOpen());
		assertFalse(safe2.getActive());
		assertFalse(safe2.deactivate());
	}

}
