/*Write a method Harmonic that accepts an integer parameter n and prints the n-th Harmonic number, 
 * i.e., 1 + 1/2 + 1/3 + ... + 1/(n-1) + 1/n Note: Use recursion. */
public class HarmonicSeq {
  public static void main(String[] args) {
    int N= Integer.parseInt(args[0]);
    System.out.println(Harmonic(N));
  }
  
  public static double Harmonic(int n) {
    if (n==1) return 1.0;
    else return Harmonic(n-1) + 1.0/n;
  } 
  
}


