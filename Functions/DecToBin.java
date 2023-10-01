import java.util.*;
public class DecToBin {
    public static void decToBin(int decNum){
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;
        while(decNum > 0){
            int rem = decNum % 2;// remender
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;//quent
        }
        System.out.println("Binary Form of " + myNum);
    }
    public static void main(String[] args) {
        decToBin(10);
    }
}
