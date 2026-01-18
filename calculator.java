// 20. Calculator using switch case

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operation you have to perform");
        String str=sc.next();
        System.out.println("Enter two number on which you need to perform the operation: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(str){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a+b);
                break;
            case "/":
                System.out.println(a/b);
                break;
        }   
    }   
}
