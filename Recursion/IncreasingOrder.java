public class IncreasingOrder {
    public static void increOrder(int n ){
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        increOrder(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        increOrder(10);
    }
}
