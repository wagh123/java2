import java.util.*;
public class FirstLetterToUpperCase {
    public static String toUpperCase(String str){
        StringBuffer sb = new StringBuffer("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1;i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i)); //here we are appending empty space as it is
                i++; //letter after the empty space
                sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi i am yogita";
        System.out.println(toUpperCase(str));
    }    
}
