// 15. Sum of digits

import java.util.Scanner;

public class sumdigit {
    public static void main(String[] args) {
        int a, sum=0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while(a!=0){
            int digit = a%10;
            sum += digit; 
            a/=10;
        }
        System.out.println(sum);
    }
}
