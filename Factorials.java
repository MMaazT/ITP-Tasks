public class Factorials {
  public static void main (String [] args) {
    int n= Integer.parseInt(args[0]);
    System.out.println(factorial(n));
    
  }
  
  public static long factorial (int n) {
    long fact=1;
    int i=1;
    while(i<=n){
      fact=fact*i;
      if(i==1) System.out.print(n+"!"+" = ");
      if(i==n) System.out.print( i+" = ");
        else System.out.print(i+ " * ");
     
       i++;
    }return fact;
  
}
  }

      
