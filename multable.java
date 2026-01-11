//  10. Table of a number.
import java.util.Scanner;

public class multable {
    public static void main(String[] args) {
        int a,num;
        System.out.println("Enter the number to make full table: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for(int i=1; i<=10; i++){
            num = a*i;
            System.out.println(a +" * "+i+" = "+num);
        }
    }
}
