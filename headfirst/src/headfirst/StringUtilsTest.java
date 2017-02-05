package headfirst;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest extends StringUtils{


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsBracketMatch() {
		assertTrue(StringUtils.isBracketMatch("{{}}"));
	
	}
	@Test
	public void testbubbleSort() {
		int[] arr = {10,9,8,7};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		StringUtils.bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
	}
	@Test
	public void testStringToFloat() throws Exception {
		System.out.println(StringUtils.StringToFloat("124.0001"));
		
	}

}
