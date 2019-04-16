public class PrintChars {
  public static void main( String [] args ) {
  int n= Integer.parseInt(args[0]);
    writeChars( n);
     System.out.println();
    
  }
  
  
  public static void writeChars(int x) {
    if (x==1) {System.out.print("*"); return; }
    if (x==2) {System.out.print("**"); return; }
     System.out.print( "<" );
     writeChars(x-2);
     System.out.print( ">" );
     
     return;
    
  }
}