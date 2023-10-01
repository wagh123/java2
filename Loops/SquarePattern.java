public class SquarePattern {
    public static void main(String[] args) {
        int col = 4;
        int row = 4;
        for(int i = 0; i < row; i++){
            for(int j =0; j < col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
