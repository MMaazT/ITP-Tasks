public class Vector {
   private final double [] coords;
   private final int N;
   public Vector(double[] a) {
     N=a.length;
     coords= new double[N];
     for (int i=0; i<N; i++) {
       coords[i]= a[i];
     }
   }
   public Vector plus( Vector b){
     double[] c= new double[N];
     for(int i=0; i<N; i++) {
       c[i]= this.coords[i]+b.coords[i];
       
     }return new Vector(c);
   }
   public Vector minus( Vector b){
     double[] c= new double[N];
     for(int i=0; i<N; i++) {
       c[i]= this.coords[i]-b.coords[i];
      
     } return new Vector(c);
   }
   public Vector scale(double b){
     double[] c= new double[N];
     for(int i=0; i<N; i++) {
       c[i]= this.coords[i]*b;
       
     }return new Vector(c);
   }
    public double dot(Vector b){
    double sum=0;
     for(int i=0; i<N; i++) {
       sum+=this.coords[i]*b.coords[i];
       
     }return sum;
    }
     public double magnitude(){
       double mag= this.dot(this);
       return mag;
        }
      public Vector direction(){
      double [] unit= new double[N];
        for(int i=0; i<N; i++) {
          unit[i]=this.coords[i]/magnitude();
      
       
     }return new Vector(unit);
    }
      public double cartesian( int i) {
        return coords[i];
      }
      public String toString(){
      String s = "";
      for (int i = 0; i < N; i++) {
        s = s + coords[i] + " ";
      }
      return s;
        
      }
      
      public static void main (String [] args) {
        double [] a= { 2, 4, 5, 7};
        double [] b={ 3, 6, 9, 11};
        
        Vector a1= new Vector(a);
        Vector b1= new Vector (b);
        
        System.out.println(a1.plus(b1));
        System.out.println(a1.minus(b1));
        System.out.println(a1.scale(4));
        System.out.println(a1.dot(b1));
        System.out.println(a1.magnitude());
        System.out.println(a1.direction());
        System.out.println(a1.cartesian(3));
        System.out.println("(" + a1.toString() + ")");
      }
}
        
          
         
         
         
        
        
        
          
      
      
    
       
   
     
    
