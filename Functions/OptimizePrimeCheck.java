import java.util.*;
public class OptimizePrimeCheck{
    public static boolean check(int num){
    if(num == 2){
        return true;
       }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % 2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(check(2));
    }
}
