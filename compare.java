// 6. Greatest of 3 numbers

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        b = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        c = sc2.nextInt();
        System.out.println("a: "+a+" ,b: "+b+" ,c: "+c);
        if(a>b){
            if(c>a){
                System.out.println("Greatest number: "+c);
            }else{
                System.out.println("Greatest number: "+a);
            }
        }else if(b>c){
            System.out.println("Greatest number: "+ b);
        }else{
            System.out.println("Greatest number: "+ c);
        }
    }
}
