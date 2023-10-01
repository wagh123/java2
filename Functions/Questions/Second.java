//Q.2) write a method named isEven that accept an int argument. the method should return true if the argument is even, or 
//false otherwise. also write program to test your method
import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter an interger : ");
        num = sc.nextInt();
        if(isEven(num)){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
