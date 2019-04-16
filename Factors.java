public class Factors {
  public static void main(String []args) {
    long n= Long.parseLong(args[0]);
    long N = n;
    for( long i =2; i<=n/i; i++){
      while (n%i==0)
      {n= n/i;
    
      System.out.println(i + " "); }}     
      
if (n>1) System.out.print(n);
System.out.println();
  }}

      