// 17. Print primes till n
import java.util.Scanner;

public class primetill_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            boolean isPrime=true;
            if(i<=1){
                isPrime=false;
            }else{
                for(int k=2;k<i;k++){
                    if(i%k==0){
                        isPrime=false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
    }
}


