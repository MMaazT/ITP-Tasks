public class Hurricane {
  public static void main(String[] args) {
    double windspeed= Double.parseDouble(args [0]);
     if (windspeed >0 && windspeed<74)
       System.out.println("Not a hurricane");
     else if (windspeed>= 74 && windspeed<=95)
       System.out.println("Category 1 Hurricane");
      else if (windspeed>95  && windspeed<=110)
       System.out.println("Category 2 Hurricane");
       else if (windspeed>110 && windspeed<=130)
       System.out.println("Category 3 Hurricane");
        else if (windspeed>130 && windspeed<=155)
       System.out.println("Category 4 Hurricane");
         else 
       System.out.println("Category 5 Hurricane");
  }
}

       