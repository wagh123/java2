import java.util.*;
public class SubArray{
    public static void printSubarray(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            // int start = i;
            for(int j = i; j < numbers.length; j++){
                // int end = j;
                for(int s = i; s <= j; s++){
                    System.out.print(numbers[s]+" "); 
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarray(numbers);
        
    }
}