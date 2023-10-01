//Q.1) write a java method to compute the average of three numbers.
import java.util.*;
public class First {

    public static int averageCal(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Third Number : ");
        int num3 = sc.nextInt();
        int avg = averageCal(num, num1, num3);
        System.out.println(avg);
    }
}
