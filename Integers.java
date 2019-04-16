public class Integers {
  public static void main(String [] args) {
    int a= Integer.parseInt(args [0]);
    int b= Integer.parseInt(args [1]);
    int c= Integer.parseInt(args [2]);
    if ((a==b) && (b==c) && (a==c)) {
       System.out.println("equal");
    }
    if ((a!=b) || (a!=c) || (b!=c))
      System.out.println("not equal");
  }}