import java.util.*;
public class LargestAndSmallest {
    public static void Largest(int matrix[][], int n, int m){
        int largest = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j<m; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }if(small > matrix[i][j]){
                    small = matrix[i][j];
                }
            }
        }
        System.out.println(largest + "," + small);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        Largest(matrix,n,m);
    }
}
