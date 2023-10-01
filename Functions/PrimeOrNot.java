public class PrimeOrNot{
    public static boolean isPrime(int num){
        

        //corner cases 

        if(num == 2){
            return true;
        }
        for(int i =2; i<=num-1; i++){
            if(num % i == 0){
                return false;
            }// we do not write else condition here beacause when any number completely divides num then it is not a prime number
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(isPrime(5));

    }
}
//here we can write this code without using isprime variable by simplying returning false inside if instead of isprime or break
//and again return true for the entire block