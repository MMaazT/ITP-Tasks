public class FarhenheitToCelsius {
  public static void main(String [] args) {
    double Ftemp= Double.parseDouble(args [0]);
   double Fcelsius= ((Ftemp - 32) / 1.8);
   
  
    System.out.println(Fcelsius);
  }
}