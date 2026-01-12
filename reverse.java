// 11. Reverse a number.
public class reverse {
    public static void main(String[] args) {
        int a = 2345, rev=0;
        while(a!=0){
            int digit= a %10;
            rev = rev * 10 + digit;
            a /= 10;
        }
        System.out.println(rev);
    }
}
