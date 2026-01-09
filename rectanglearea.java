// 4. Find area of rectangle
import java.util.*;
public class rectanglearea {
    public static void main(String[] args) {
        int l,b,a;
        Scanner sc=new Scanner(System.in);
        l = sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        b = sc1.nextInt();
        System.out.println("Length: "+ l +" ,Breadth: "+ b);
        a=l*b;
        System.out.println("Area: "+ a);
    }
}
