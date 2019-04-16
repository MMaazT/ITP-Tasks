//Write a recursive method mutliply(a, b) to multiply two positive integers, but you can only use the + or ? operators.
public class Multiplication {
  public static void main(String [] args) {
    int a= Integer.parseInt(args[0]) ;
    int b = Integer.parseInt(args[1]);
    
    System.out.println(Product( a,b));
  }
  public static int Product( int a , int b) {
    if (b==1) return a;
    return a+ Product(a, b-1); 
  }
}
