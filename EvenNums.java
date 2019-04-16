//Write a method named percentEven that accepts an array of integers as a parameter and returns the percentage of 
//even numbers in the array as a real number. For example, if a variable named nums refers to an array of the elements
//{6, 2, 9, 11, 3}, then the call of percentEven(nums) should return 40.0. If the array contains no even elements or
//no elements at all, return 0.0.
public class EvenNums{
  public static void main(String [] args) { 
    int N= Integer.parseInt(args[0]);
    int [] nums= new int [N];
    for (int i=0; i<N; i++){
      
       nums[i]=Integer.parseInt(args [i+1]) ;}
    System.out.println(percentEven(nums));
    
  }
  
  public static double percentEven(int []a) {
    if (a.length==0) return 0.0;
    
    double count=0;
    for (int i=0; i<a.length; i++){
      if (a[i] % 2 ==0) {
        count++; }
    }
        
       if (count==0) return 0.0; 
      
    return count/a.length*100;
    
    }
  }
    
      
    



















  