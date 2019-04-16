//Find Greatest Common Divisor (GCD) of two numbers using recursion.
public class GCD {
  public static void main(String [] args) {
    int p= Integer.parseInt(args[0]);
    int q= Integer.parseInt(args[1]);
    if (p>=q)
    System.out.println(HCF(p, q));
    else  System.out.println(HCF(q, p));
  
  }
  public static int HCF(int x, int y) {
    if (y==0) return x;
    return HCF(y, x%y);
  }
}

