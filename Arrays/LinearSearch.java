public class LinearSearch {
    public static int linearSearch(int arr[]){
        int key = 10;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                // System.out.println("Index of "+ key +" element present in array " + i);
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        int Index = linearSearch(arr);
        System.out.println(Index);
    }
}
 