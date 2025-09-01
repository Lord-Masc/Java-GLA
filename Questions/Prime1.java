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
    public static void main(String[] args) {


        int num = 13;
        int flag = 0;
        for(int  i = 2 ;i<num;i++){
            if (num%i == 0) {
                flag = 1;
                break;
            }
            else{
                flag = 0;
                System.out.println(i);
            }
        }
        // isPrime(40);
        if (flag == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
