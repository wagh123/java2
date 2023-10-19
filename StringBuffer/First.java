import java.util.*;
public class First {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");//initilize sb with empty string
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
