import java.util.*;
public class Factorial{
    public static int fact(int num){
        int sum = 1;
        for(int i = 1; i <= num; i++){
            sum =  sum * i;
        }
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = fact(n);
        System.out.println(sum);
    }
}