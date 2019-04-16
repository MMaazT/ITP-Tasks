public class Anagram {
  public static void main(String[] args){
    String s = args[0].toLowerCase();
    char[] a = s.toCharArray();
    int n = a.length;

    String t = args[1].toLowerCase();
    char[] b = t.toCharArray();
    int m = b.length;

    for(int i=0; i<n; i++) {
      char c = a[i];
      if(!Character.isWhitespace(c)) {
        boolean flag=false;
        for(int j=0; j<m; j++) {
          if(b[j]==c) {
            b[j]=' ';
            flag=true;
            break;
          }
        }
        if(!flag) {
          System.out.println("Input strings are not anagrams");
          return;
        }
      }
      
    }
    
    for(int j=0; j<m; j++) {
      if(!Character.isWhitespace(b[j])) {
          System.out.println("Input strings are not anagrams");
          return;
      }
    }
           
        
    System.out.println("Input strings are anagrams");
    
  }
}
