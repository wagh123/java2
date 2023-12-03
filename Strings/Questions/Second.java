import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";
// convert strings to lowercase. why? so that we don't have to check seperately for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
//first check if the length are the same
        if (str1.length() == str2.length()) {
            //convert string into character array
             char[] str1toCharacterArray = str1.toCharArray();
             char[] str2toCharacterArray = str2.toCharArray();
// sort the char ARray
             Arrays.sort(str1toCharacterArray);
             Arrays.sort(str2toCharacterArray);
//if the sorted charnarray are same or identical then the strings are anagram
             boolean result = Arrays.equals(str1toCharacterArray, str2toCharacterArray);

             if (result) {
                System.out.println(str1 + " and " + str2 +" are anagrams of each other.");
             }else{
                System.out.println(str1 + " and " + str2 +" are not anagrams of each other.");
             }
        }else{
            //case when length of str1 and str2 are not equal
            System.out.println(str1 + " and " + str2 +" are not anagrams of each other.");

        }
    }     
}