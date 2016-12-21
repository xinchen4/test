package hash;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHashcode1() {
		Word aa = new Word("aa");
		assertEquals("hashcode wrong", 0, aa.hashCode());
	}
	@Test
	public void testHashcode2() {
		Word ab = new Word("ab");
		assertEquals("hashcode wrong", 1, ab.hashCode());
	}
	
}
