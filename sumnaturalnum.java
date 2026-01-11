// 9. Sum of n natural no.
import java.util.Scanner;

public class sumnaturalnum{
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter a number upto which you want the sum:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1; i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}