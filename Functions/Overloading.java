public class Overloading{

    public static int multiplication(int a, int b){
        return a+b;
    }
    public static int multiplication(int a, int b, int c){
        return a+b+c;
    }
    public static int multiplication(int a, int b, int c, int d){
        return a+b+c+d;
    }

    //function to calculate interger sum
    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String args[]){
        System.out.println(multiplication(3,4));
        System.out.println(multiplication(3,4,5));
        System.out.println(multiplication(3,4,5,5));
        System.out.println(sum(5,5));
        System.out.println(sum(3.3f, 3.3f));

    }
}