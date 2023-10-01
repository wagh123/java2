public class MaxSubarraySum2 {
    
    public static void printMaxSum(int num[]){
        int currSum = 0;
        int count = 0;
        int maxSum = Integer.MIN_VALUE;
        int smallest = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++){
            if(num[i] < 0){
                count++;
            }
        }
        if(count == num.length){
            for(int i = 0; i < num.length; i++){
               if(smallest < num[i]){
                  smallest = num[i];
               }
            }
            System.out.println(smallest);
        }else{
            for(int i = 0; i < num.length; i++){
            currSum = currSum + num[i];

            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);

        }
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,-4,-1,-2,-1,-5,-3};
        printMaxSum(numbers);
    }
}
//this algorithm will not going to work for array with all negative numbers
//to make work for array with all negative numbers we have to add special condition 
// the condition willl check the element inside the array are negative or not and 
//if all numbers inside array is negative then print the smallest negative value present inside array