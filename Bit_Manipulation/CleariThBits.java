public class CleariThBits {
    public static int clearIthBits(int n, int i){
        int bitmask = -1 << i;
        return n & bitmask;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = (~0) << (j+1);
        int b = (1 << i) -1;

        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBits(10, 2));
        System.out.println(clearBitsInRange(10, 2, 4));
    }
}
