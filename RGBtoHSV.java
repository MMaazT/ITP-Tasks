/* Muhammed Maaz Tariq ERP:12407*/

public class RGBtoHSV {
  public static void main(String [] args) {
    
    double R= Double.parseDouble(args [0]);
    double G= Double.parseDouble(args [1]);
    double B= Double.parseDouble(args [2]);
    
    if ((R>=0 && R<=255) && (G>=0 && G<=255) && (B>=0 && B<=255)) 
    {
      
      double r= R/255;
      double g= G/255;
      double b= B/255;
    
    
      
      double Cmax =Math.max( r, Math.max(g, b));
      double Cmin=Math.min( r, Math.min(g, b));
      double delta= Cmax - Cmin;
      
      
        double Hue;
      if (delta==0){
        Hue=0;
        System.out.println("Hue: "+Hue);
      }
      else if (Cmax==r) {
        Hue= 60*(((g - b)/delta)%6);
        if (Hue >0 && Hue <=255) {System.out.println("Hue: "+Math.round(Hue));}
        else {System.out.println("Error: Hue value is calculated to be less than zero or greater than 255. Try with different RGB values.");}
        }
      else if (Cmax==g){
        Hue= 60*(((b - r)/delta)+2);
        if (Hue >0 && Hue<=255) {System.out.println("Hue: "+Math.round(Hue));}
        else {System.out.println("Error: Hue value is calculated to be less than zero or greater than 255. Try with different RGB values.");}
      }
      else if (Cmax==b) {
        Hue= 60*(((r - g)/delta)+4);
        if (Hue >0&& Hue <=255) {System.out.println("Hue: "+Math.round(Hue));}
        else {System.out.println("Error: Hue value is calculated to be less than zero or greater than 255. Try with different RGB values.");} 
      }
      
      double Saturation;
      if (Cmax==0) {
        Saturation=0;
        System.out.println("Saturation: " + Saturation);
      }
      else {
        Saturation= delta/Cmax ;
        if (Saturation>0 ) {
        System.out.println("Saturation: " + Math.round(100*Saturation));
      }
        else {
          System.out.println("Error: Saturation value is coming less than zero. Try with different RGB values.");}
      }
      
      double Brightness=Cmax;
      System.out.println("Brightness: "+ Math.round(100*Brightness));
      
  }
    
    
    else
      System.out.println("ERROR: The value(s) of R, G, and/or B is/are not in the range 0-255. Try again with new values.");
  }
}
    



      
       
        
       
         
       
      
      
    
    