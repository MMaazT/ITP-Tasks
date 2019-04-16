public class Matrix 
{
  public static void main(String [] args)
  {
    int N=5;
    
    System.out.println("The Matrix is:");
    double [][] mat= new double [N][N];
    for (int i=0; i<N; i++) {
      for (int j=0; j<N; j++) {
        mat[i][j]= Math.random();
        
        System.out.print(mat[i][j] + "  ");
        
             
       }
      System.out.println();
    }
     System.out.println();
    System.out.println("The transpose of the above matrix is:");
    
    
    
    double [][] t= new double [N][N];
    for (int i=0; i<N; i++) {
      for (int j=0; j<N; j++) {
        t[i][j]= mat[j][i];
        
        System.out.print(t[i][j] + "  ");
        
                
        
      }
      System.out.println();
    }
    System.out.println();
    
    System.out.println("The product is:");
    
    double [][] product= new double[N][N];
    for (int i=0; i<N; i++) {
      for (int j=0; j<N; j++) {
        for (int k=0; k<N; k++) {
          product[i][j]+= mat[i][j] * t[i][j];
           }
        System.out.print(product[i][j] + "  ");
      }
      System.out.println();
    }
    
    
    
    
    
    
    
  }
   
}
                           
                                                
                           
                           
    