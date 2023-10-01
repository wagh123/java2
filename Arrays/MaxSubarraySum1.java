public class MaxSubarraySum1 {
    // using prefix array
    public static void printMaxSum(int num[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixArr[] = new int[num.length];

        prefixArr[0] = num[0];
        for(int i = 1; i < prefixArr.length; i++){
            prefixArr[i] = prefixArr[i-1] + num[i];
        }

        for(int i= 0; i < num.length; i++){
            int start = i;
            for(int j = i; j < num.length; j++){
                int end = j;
                currentSum =  start == 0 ? prefixArr[end] : prefixArr[end] - prefixArr[start - 1];
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("max sum : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        printMaxSum(numbers);
    }
}
