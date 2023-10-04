public class EqualsFunction {

    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");
       
        // if(s1 == s3){
        //     System.out.println("same");
        // }else{
        //     System.out.println("not same");
        // }  //***********it will not work  */


        /******using equals() function *******/
         if(s1.equals(s3)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        // substring
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));
        System.out.println(subString(str, 0, 5));


    }
}
