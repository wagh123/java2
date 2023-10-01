public class First {
    //1)  BUBBLE SORT
    // public static void bubbleSort(int arr[]){
    //     for(int turn = 0; turn < arr.length-1; turn++){
    //         for(int i = 0; i < arr.length-turn-1;i++){
    //             if(arr[i] > arr[i+1]){
    //                 int temp = arr[i];
    //                 arr[i] = arr[i+1];
    //                 arr[i+1] = temp;
    //             }
    //         }
    //     }
    // }

    // 2) SELECTION SORT
    // public static void selectionSort(int arr[]){

    //     for(int i = 0; i < arr.length-1; i++){
    //         int min = i;
    //         for(int j = i +1; j < arr.length; j++){
    //             if(arr[j] < arr[min]){
    //                 min = j;
    //             }
    //         }
    //         int temp = arr[min];
    //         arr[min] = arr[i];
    //         arr[i] = temp;
    //     }
    // }

    // 3) insertion sort
    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length-1; i++){
            int curr =  i;
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = arr[curr];
        }
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        insertionSort(arr);
        print(arr);
    }
}
