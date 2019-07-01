package pal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeleniumTest {
	@Test
	public void testIsPalindrome_Kayak_ReturnsTrue() {
		String str = "not";
		TestPalindrome check = new TestPalindrome();
		
		assertEquals(true, check.isPalindrome(str));	
	}
}
