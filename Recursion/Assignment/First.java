
public class First {
    public static void printIndex(int n[], int i, int key){
        if (i == n.length) {
            return;
        }
        if (n[i] == key) {
            System.out.println(i);
        }
        printIndex(n, i+1, key);

    }
    public static void main(String[] args) {
        int n[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        printIndex(n, 0, key);
    }
}
