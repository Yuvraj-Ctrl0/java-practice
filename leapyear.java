// 7. Check leap year

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if(year%4==0){
            System.out.println(year+ " is a leap year.");
        }else{
            System.out.println(year+ " is not a leap year.");
        }
    }
}
