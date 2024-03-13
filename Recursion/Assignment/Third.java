
public class Third {
    public static int printSubstrings(String str){
       if (str.length()==0) {
         return 0;
       }
       return printSubstrings(str.substring(1)) + 1;
    }
    
    public static void main(String[] args) {
      String str = "abcab";
      System.out.println(printSubstrings(str));
    }
}
