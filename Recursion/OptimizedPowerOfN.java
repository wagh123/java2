public class OptimizedPowerOfN {
    public static int power(int a, int n){
        if (n == 0) {
            return 1;
        }
        int halfPower = power(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        if (n%2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(power(a,n));
    }
}
