public class inverted_HalfPyramid_WithNumber {

    public static void halfPyramid_WithNumber(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        halfPyramid_WithNumber(5);
    }
}
