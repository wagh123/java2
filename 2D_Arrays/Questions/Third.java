// Q.3) write a program to find transpose of a matrix
public class Third {
    public static void transpose(int matrix[][]){
        int row = 2, col = 3;
        int transpose[][] = new int[col][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        print(transpose);
    }
    public static void print(int matrix[][]){
        System.out.println("The Matrix is = ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6}};
        transpose(matrix);
        // print(matrix);
    }
}
