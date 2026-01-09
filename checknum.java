// 5. Check number positive or negative

import java.util.Scanner;

public class checknum {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        if(a<0){
            System.out.println(a+ " is a negative number.");
        }else{
            System.out.println(a+ " is a positive number.");
        }
    }
}
