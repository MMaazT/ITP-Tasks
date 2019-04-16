public class  LongestRun {
  public static void main (String[] args) {
  
    
   int num_prev = StdIn.readInt();
   int num_count=1;
   int run_length = 1;
   int next_num=0;
   
   
    while(!StdIn.isEmpty()) {
      int current_num= StdIn.readInt();
      if (current_num==num_prev) {
        num_count++;
         }
      else
      {
        num_prev=current_num; 
        num_count=1;}
      if (num_count>run_length) {
        run_length=num_count;
        next_num=current_num;
              }
      
              
    }
   
   System.out.println("Longest run:" + run_length );
     System.out.println("consecutive:" + next_num  );
  }
  }


      
     