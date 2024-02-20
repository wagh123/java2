public class CleariThBit{

    public static int cleariThBit(int n, int i){
        int bitmask = ~(1 << i);

        return n & bitmask;
    }
    public static void main(String[] args) {
        int result = cleariThBit(10, 1);
        System.out.println(result);
    }
}