public class TilingProblem {
    public static int tilingProblem(int n){
        //base case
        if (n == 1 || n == 0) {
            return 1;
        }
        //choices
        //vertical choice

        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);
        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        System.err.println(tilingProblem(4));
    }
}
