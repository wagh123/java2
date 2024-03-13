public class CheckNOisPowerOf2OrNot {
    public static boolean checkNumberIsPowerOfTwoOrNot(int n){
       return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
       System.out.println(checkNumberIsPowerOfTwoOrNot(3));
    }
}
