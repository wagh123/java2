public class PowerOfN {
    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;

        //instead of writing above three statements we can also write it in one single line

        // return x * power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
