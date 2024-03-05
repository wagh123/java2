public class LastOccurence {
    public static int lastOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOccurence(arr, key, i+1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,5,1,2};
        int key = 1;
        int i = 0;
        System.out.println(lastOccurence(arr, key, i));

    }
}
