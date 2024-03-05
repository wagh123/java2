public class findFactorial {
    public static int findFact(int n){
        if (n == 0) {
            return 1;
        }
        int fact = findFact(n-1);
        int factN = n * fact;
        return factN;
        
    }
    public static void main(String[] args) {
        System.out.println(findFact(3));
    }
}
