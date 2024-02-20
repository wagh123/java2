public class UpdateiThBit {
    public static int setIthBit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static int cleariThBit(int n, int i){
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
    public static int updateiThBit(int n, int i, int newBit){
        // if (newBit == 0) {
        //     return cleariThBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        //ANOTHER WAY OF DOING THIS CODE IS 

        n = cleariThBit(n,i);
        int bitmask = newBit << i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        int result = updateiThBit(10, 2, 1);
        System.out.println(result);
    }
}
