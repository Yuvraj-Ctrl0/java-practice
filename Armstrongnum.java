// 19. Armstrong number
import java.util.Scanner;

public class Armstrongnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int count=0;
        int num=n; 
        int temp=n; 
        int sum=0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println(count);
        while(temp>0){
            int a=temp%10;
            System.out.print(Math.pow(a,count)+"+");
            sum += (int)Math.pow(a,count);
            temp /=10;
        }
        System.out.println("="+sum);
        if(sum==n){
            System.out.println(n+" is an armstrong number.");
        }else{
            System.out.println(n+" is not an armstrong number.");
        }
    }
}
