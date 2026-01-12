// 14. Factorial using loop

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num,sum=1;
        System.out.println("Enter a num to calculate it's factorial: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i=1;i<=num;i++){
            sum = sum*i;
        }
        System.out.println(sum);
    }
}
