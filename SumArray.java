// 22. Sum Array 

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number elements you want to add in array: ");
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        System.out.println("Enter the elements you want to add in array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("\nSum of Array is: "+sum);
    }
}

