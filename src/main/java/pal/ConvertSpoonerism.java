package pal;

public class ConvertSpoonerism {
  
  public String convert(String one, String two){
    char first = one.charAt(0);
    char second = two.charAt(0);
    one = second + one.substring(1);
    two = first + two.substring(1);
    
    return one + " " + two;
  }
}
