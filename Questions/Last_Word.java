public class Last_Word {
    public static void main(String[] args) {
        String s = "This is a Lasy Word";
        String k[]= s.trim().split(" ");
        int length = (k[k.length-1]).length();
        System.out.println(" "+k[k.length-1]);
        System.out.println(length);
    }
}
