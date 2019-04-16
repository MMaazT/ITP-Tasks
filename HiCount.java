/*Exercise 3:
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string. 

countHi("xxhixx") ? 1
countHi("xhixhix") ? 2
countHi("hi") ? 1
*/
import java.util.Scanner;
public class HiCount {
  public static void main(String [] args) {
    Scanner in= new Scanner(System.in);
    String s= in.next();
    System.out.println(count(s));
  }
  public static int count(String s) {
    if (s.length()<=1) return 0;
    if ((s.charAt(0)=='h') && (s.charAt(1)=='i'))
      return 1+ count(s.substring(2));
    else
      return count(s.substring(1));
  }
}
                      
  
  
