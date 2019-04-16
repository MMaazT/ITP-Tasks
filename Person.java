public class Person {
  
      private String first;
      private String last;
      private int id;
      
      private static int nextid = 1001;

      public Person( String f, String l) {
        first = f;
        last = l;
        
        id = nextid;
         nextid++;
  
      }
      public String toString(){
        return  first+ " " + last + "\t Id: " + id;
   }
      public static void main(String[] args) {
        String s= args[0];
        String l= args[1];
        Person t= new Person (s, l);
        System.out.println(t);
      
      }
}
        
        

