public class SumOfNNaturalNo {

    public static int sumOfNaturalNo(int n){
        if (n == 1) {
            return 1;
        }
        int fnm1 = sumOfNaturalNo(n-1);
        int sum = n + fnm1;
        return sum; 
    }
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNo(3));
    }
}
