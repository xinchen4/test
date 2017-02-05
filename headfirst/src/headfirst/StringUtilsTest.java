package headfirst;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsBracketMatch() {
		assertTrue(StringUtils.isBracketMatch("{{}}}"));
	
	}

}
