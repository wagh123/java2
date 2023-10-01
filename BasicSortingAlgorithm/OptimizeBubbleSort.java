public class OptimizeBubbleSort {
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length-1; turn++){
            int swapping = 0;
            for(int j = 0; j < arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapping++;
                }
            }
            if(swapping == 0){
                break;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        int arr[] = {1,6,3,7,2,9};
        bubbleSort(arr);
        printArr(arr);
    }
}
