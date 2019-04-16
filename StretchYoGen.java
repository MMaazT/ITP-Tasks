public class StretchYoGen
{
  public static void main(String [] args){
    int N=Integer.parseInt(args[0]);
    int [] x= new int[N];
    for (int i=0; i<N; i++){
      x[i]=Integer.parseInt(args[i+1]); }
    int [] nx= Stretch(x);
    for (int i=0; i<2*x.length; i++){
      System.out.print(nx[i]+ " ");
      
  } System.out.println();
  }
  public static int[] Stretch (int []y) {
    int []z= new int [2*y.length];
    for (int i=0; i<y.length; i++) {
      if (y[i] %2==0) {
        z[2*i]= y[i]/2;
        z[2*i+1]=y[i]/2;
      }
      else {
        z[2*i]=y[i]/2 +1;
        z[2*i+1]=y[i]/2;
        
      }
    }
    return z;
  }
}