public class LargestNumber {
    public static int findLargestNumber(int arr[]){
        int LargestNum = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(LargestNum < arr[i]){
                LargestNum = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest value is " + smallest);
        return LargestNum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,10};
        int LargestNum = findLargestNumber(arr);
        System.out.println(LargestNum);
    }
}
