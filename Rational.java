public class Rational {
 
  private  int n0;
  private  int d0;
  public Rational ( int numerator, int denominator) {
    n0=numerator;
    d0=denominator;
  }
  public Rational plus( Rational b)
  {
    int numerator=n0*b.d0+b.n0*d0;
    int denominator=d0*b.d0;
      
      return new Rational(numerator, denominator);
  }
   public Rational minus( Rational b)
  {
    int numerator=n0*b.d0-b.n0*d0;
    int denominator=d0*b.d0;
      
      return new Rational(numerator, denominator);
   }
    public Rational times( Rational b)
  {
    int numerator=n0*b.n0;
    int denominator=d0*b.d0;
      
      return new Rational(numerator, denominator);
    }
    
     public Rational divides( Rational b)
  {
    int numerator=n0*b.d0;
    int denominator=d0*b.n0;
      
      return new Rational(numerator, denominator);
     }
     public String toString(){
       return n0 + "/" + d0;
     }
     
     public static void main(String[] args) {
       Rational A= new Rational (2,10);
       Rational B= new Rational (1,5);
       
       System.out.println(A.plus(B).toString());
       System.out.println(A.minus(B).toString());
       System.out.println(A.times(B).toString());
       System.out.println(A.divides(B).toString());
     }
}
     
     
       
