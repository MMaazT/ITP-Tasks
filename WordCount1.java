public class  WordCount1 {
  public static void main (String[] args) {
    
    int count = 0;    
     while (!StdIn.isEmpty()) {
          String x = StdIn.readString();
          count++;
     }
        
    System.out.println("NUMBER OF WORDS :" + count);
    
  }
}
