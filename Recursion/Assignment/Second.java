import java.util.*;
public class Second {
    public static void printTheString(String number[], int n){
        if (n == 0) {
            return;
        }
        int lastDigit = n%10;
        printTheString(number, n/10);
        System.out.print(number[lastDigit]+ " ");
    }
    public static void main(String[] args) {
        String number[] = {"zero", "one", "two", "three", "four","five","six","seven","eight","nine"};
        int num = 0021;
        printTheString(number, num);
    }
}
