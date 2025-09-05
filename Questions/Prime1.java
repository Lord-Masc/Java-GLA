public class Prime1 {


    // // check number is prime or not
    // static boolean checkPrime(int n){
    //     boolean flag = 
    // }
    // static void isPrime(int n){
    //     // boolean flag = 0;
    //     for (int i = 2; i <=n; i++) {
    //         if(n%i==0) {
    //             // System.out.println(n);
    //             System.out.println("Not Prime");
    //         }else{
    //         System.out.println(i);

    //         }
    //     }  
    // }

    static void printPrime(int n){
        boolean flag = false;
        for(int i = 2;i<=n;i++){
             if (n%i==0) {
                flag = true;
                 break;
             }
             if(!flag){
                System.out.println(i);
             }else{
                flag = false;
             }
             
        }
    }
    public static void main(String[] args) {


        int num = 13;
        boolean isPrime = true; // Assume the number is prime until proven otherwise

        for (int i = 2; i < num; i++) {
            if (num%i == 0) {
                isPrime = false; // Found a factor, so it's not prime
                break; // No need to check further, exit the loop
            }
        }
        if (isPrime && num > 1) { // 0 and 1 are not prime numbers
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
        printPrime(100);
    }
}
