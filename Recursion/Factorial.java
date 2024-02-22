public class Factorial {
    public static void findFact(int n){
        if (n==1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        findFact(n-1);
    }
    public static void main(String[] args) {
        findFact(10);
    }
}
