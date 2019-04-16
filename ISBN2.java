/* Muhammed Maaz Tariq ERP: 12407 */

public class ISBN2 {
  public static void main(String []args){
    int n= Integer.parseInt(args[0]);
    String N = String.format("%09d", n);
    
    int i=2;
    int sum=0 ;
    int rem;
    while (i<=10) {
    rem=(n%10);
    sum=sum+(rem*i);
    n=n/10;
    i=i+1;
            
    }
    int checksum=0;
    while (sum%11 !=0) {
       sum=sum+1;
       checksum=checksum+1;
    }
      
    System.out.println("The checkdigit is: " + checksum+ ".");
    if (checksum!=10) {
     Integer.toString(checksum);
     System.out.println( "Thus, the ISBN number is " +N +checksum+ ".");}
    else {
       Integer.toString(checksum);
     System.out.println( "Thus, the ISBN number is " +N +"X"+ ".");
     }
  }
  
}
  
 
    
 
  

    