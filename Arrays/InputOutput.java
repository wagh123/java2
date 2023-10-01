import java.util.*;
public class InputOutput {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);

        marks[0] =  sc.nextInt();//phy
        marks[1] = sc.nextInt();//che
        marks[2] = sc.nextInt();//math

        System.out.println("phy : " + marks[0]);
        System.out.println("Che : " + marks[1]);
        System.out.println("Math : " + marks[2]);


        //update marks of math
        marks[2] = 100;//math
        System.out.println("Math : " + marks[2]);

        marks[2] = marks[2] + 1;
        System.out.println("Math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("average : "+ percentage + " %");

        // length of array
        System.out.println("Length of array is : " +marks.length);


    }    
}
