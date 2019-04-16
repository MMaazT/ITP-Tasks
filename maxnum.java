//Write a static method max3() that takes three int arguments and returns the value of the largest one. 
//Add an overloaded function that does the same thing with three double values.
public class maxnum {
public static int max3 (int a, int b, int c) {
  int max=a;
  if (b>a) max=b;
  if (c>a) max= c;
   
  return max;
  
}

public static double max3 (double a, double b, double c) {
  double max=a;
  if (b>a) max=b;
  if (c>a) max= c;
   
  return max; 
}

public static void main(String []args){
  int a= Integer.parseInt(args[0]);
  int b= Integer.parseInt(args[1]);
  int c= Integer.parseInt(args[2]);
  
  double d= Double.parseDouble(args[3]);
  double e= Double.parseDouble(args[4]);
  double f= Double.parseDouble(args[5]);
  
  System.out.println ("The maximum integer nunmber is "+ max3(a ,b ,c));
  System.out.println ("The maximum double nunmber is "+ max3(d ,e ,f));
}

}
