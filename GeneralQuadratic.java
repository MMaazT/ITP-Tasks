public class GeneralQuadratic  {
  public static void main(String [] args) {
    
    int a = Integer.parseInt ( args[0]);
    int b = Integer.parseInt ( args[1]);
    int c = Integer.parseInt ( args[2]);
    
    if (a==0) 
    {System.out.println("Coeffiecient of x^2 is zero. Not a quadratic equation.");
    }
    else
    {
    double discriminant= (b*b) - (4*a*c);
    
    if (discriminant < 0) 
    {System.out.println("The roots are Complex");
    }
    else
    {
    double sqroot= Math.sqrt(discriminant);
    double root1= (-b + sqroot) / (2*a);
    double root2= (-b - sqroot) / (2*a);
    
    System.out.println(root1);
    System.out.println(root2);}
    }
  }
    
}