public class MaxMin 
{
  public static void main(String[] args) {
    int max= Integer.MIN_VALUE;
    int min= Integer.MAX_VALUE;
      
      while(!StdIn.isEmpty()) {
        int x=StdIn.readInt(); 
        if (x>max) max=x;
          else if (x<min)
            min=x;
          
      }
      System.out.println("The maximum number is:"+max);
      System.out.println("The minimum number is:"+min);
  }
}
                          
        
           
    
                            