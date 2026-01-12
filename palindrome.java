// 12. Check palindrome number
public class palindrome {
    public static void main(String[] args){
        int a= 1221, rev=0;
        int original = a;
        while(a!=0){
            int digit = a%10;
            rev = rev * 10 + digit;
            a/=10;
        }
        if(original == rev){
            System.out.println("it's a palindrome.");
        }else{
            System.out.println("it's not a palindrome.");
        }
    }
}
