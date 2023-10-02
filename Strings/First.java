import java.util.*;
public class First {
    public static void print(String str2){
        for(int i = 0; i < str2.length();i++){
            System.out.print(str2.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String str =  sc.next();
        String firstName = "yogita";
        String lastname = "wagh";

        //concatenation
        String fullName = firstName +" "+ lastname;
        String str2 = sc.nextLine();

        // System.out.println(str);
        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println(str2.charAt(2));
        System.out.println(fullName);
        print(str2);
    }
}
