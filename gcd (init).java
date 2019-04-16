/* Muhammed Maaz Tariq ERP: 12407 */

public class gcd {
  public static void main(String[] args) {
    int x= Integer.parseInt(args[0]);
    int y= Integer.parseInt(args[1]);
       
    while ((x%y) !=0) {
       
      int z= x%y ;
      x= y;
      y=z;
       
       
    }
    System.out.println(" The greatest common divisor of the two numbers input is " + y + ".");
                   
  }
}
    




 