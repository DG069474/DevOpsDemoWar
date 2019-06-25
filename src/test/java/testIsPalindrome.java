
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testIsPalindrome {
	@Test
	public void testIsPalindrome_Kayak_ReturnsTrue() {
		String str = "kayak";
		TestPalindrome check = new TestPalindrome();
		
		assertEquals(true, check.isPalindrome(str));	
	}
}
