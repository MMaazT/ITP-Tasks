public class Binary2 {
  public static void main(String[] args) {
    int N= Integer.parseInt(args[0]);
    int n= N;
    String g= "";
    while (n>0) {
      if (n% 2==0)
        g="0"+g;
      else
        {g= "1"+ g;
      n=n/2;}
    
    System.out.print(g);
  }
}
      
    
    
    