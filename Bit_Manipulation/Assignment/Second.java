import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of A : ");
        int a = sc.nextInt();
        System.out.print("enter the value of B : ");
        int b = sc.nextInt();

        System.out.println("The value of a before swap : "+a);
        System.out.println("The value of b before swap : " +b +"\n");
        a = a + b;
        b = a -b;
        a = a -b;
        System.out.println("The value of a after swap : "+a);
        System.out.print("the value of b after swap :" +b);
    }
}
