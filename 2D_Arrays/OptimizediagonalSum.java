public class OptimizediagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];

            // i + j == matrix.length-1;
            //i.e    j == matrix.length - 1 - i;

            if(i != matrix.length-1-i){ // condition for overlap value i.e when i != j 
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;

        //TIME COMPLEXITY O(N)
    }
    public static void main(String[] args) {
        // int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int matrix[][] = {{0,1,2},{3,4,5},{6,7,8}};
        System.out.println(diagonalSum(matrix));
    }
}
