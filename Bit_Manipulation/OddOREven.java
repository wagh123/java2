public class OddOREven {
    public static void oddOrEven(int n){

        int bitmask = 1;

        if ((n & bitmask) == 0) {
            System.out.println("the number is even : " + n);
        }else{
            System.out.println("the number is odd : " +n);
        }
    } 
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
    }    
}
