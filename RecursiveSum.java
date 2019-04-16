//Write recursive method sum(n) to sum numbers from 1 to n.
public class RecursiveSum {
  public static void main(String [] args) {
    int n =Integer.parseInt(args [0]);
  System.out.println(sum(n));
  }
  
  public static int sum( int x) {
    if (x==0) return 0;
    return (x)+ sum(x-1);
  }
}