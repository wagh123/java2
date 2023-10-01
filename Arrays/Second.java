public class Second {

    public static void update(int a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = a[i] + 1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {97, 98, 99};

        update(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
