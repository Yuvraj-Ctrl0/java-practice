// 2. Add two numbers (user input)
import java.util.*;
public class add {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("first number:- "+a);
        Scanner sc1= new Scanner(System.in);
        b = sc.nextInt();
        System.out.println("Second number:- "+b);
        c= a+b;
        System.out.println(c);
    }
}
