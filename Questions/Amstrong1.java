public class Amstrong1 {
    public static void main(String[] args) {
        int n = 4181;
        int sum = 0;
        
        int count = (int)Math.log10(n)+1;


        while (n!=0) {
            int k = n%10;
            sum +=Math.pow(k, count);
            n = n/10;
        }
        System.out.println(sum);
    }
}
