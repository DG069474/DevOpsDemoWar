package pal;

public class TestPalindrome {
	public boolean isPalindrome(String pal) {
		
	String reverse = "";
        
        for(int i = pal.length() - 1; i >= 0; i--)
        {
            reverse = reverse + pal.charAt(i);
        }
        
		if(pal.equals(reverse)){
			return true;	
		}
		else{
			return false;	
		}
  }
}
