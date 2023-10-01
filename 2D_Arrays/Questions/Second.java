// Q.2) print out the sum of the numbers in the second row of the "nums" array
public class Second {
    public static void print(int nums[][]){
        int row =1, col = 0;

        int sum = 0;
        while(row == 1 && col < nums[0].length){
            sum = sum + nums[row][col];
            col++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,4,9},{11,4,3},{2,2,3}};
        print(arr);
    }
}
