public class Second{

    public static void reverseFromPivot(int nums[], int pivot){
        for(int i = 0; i < (nums.length)/2; i++){
            if(i < pivot){
                int temp = nums[pivot + i];
                nums[pivot + i] = nums[i];
                nums[i] = temp;
            }else{
                nums[i] = nums[pivot+i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {0,1,2,4,5,6,7};
        int pivot = 3;
        reverseFromPivot(nums, pivot);
    }
}