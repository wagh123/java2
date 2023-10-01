import java.util.*;
public class LinearSearch1 {
    public static int linearSearch(String m[], String k) {
        for(int i = 0; i < m.length; i++){
            if(m[i].equals(k)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"dosa", "chole", "samosa"};
        String key = "samosa";
        int index = linearSearch(menu, key);

        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println(index);
        }
    }
}
