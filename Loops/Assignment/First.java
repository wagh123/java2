package Assignment;
import java.util.*;
//write a program that reads a set of integers, and then prints the sum of the even and odd integers
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int evenSum =0;
        int oddSum =0;
        do{
            System.out.print("Enter the number : ");
            num = sc.nextInt();

            if(num % 2 == 0){
                evenSum += num;
            }else{
                oddSum += num;
            }

            System.out.print("Do you want to continue ? press 1 for yes or 0 for no : ");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of the even numbers : " +evenSum);
        System.out.println("Sum of the Odd numbers : " +oddSum);
    }
}
