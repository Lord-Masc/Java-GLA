public class Febonachi1 {

    static int Febonachi(int n){
        // int feb = 0;
        if(n<=1){
            return n ;
        }
        // return Febonachi(n)+Febonachi(n-1);
        return Febonachi(n-1)+Febonachi(n-2);
        

       
    }
    public static void main(String[] args) {
        System.out.println(Febonachi(12));
    }
}
