public class FriendsPairing {
    public static int frinedsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int fnm1 = frinedsPairing(n - 1);
        int fnm2 = frinedsPairing(n - 2);
        int pairWays = (n-1) * fnm2;
        int totWays = fnm1 + pairWays;
        return totWays;


        // we can replace all above code with just one return statement
        // return frinedsPairing(n-1) + (n-1) * frinedsPairing(n -2);
    }
    public static void main(String as[]){
        System.out.println(frinedsPairing(3));
    }
}
