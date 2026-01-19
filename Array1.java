// 21. Array input and print

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number elements you want to add in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements you want to add in array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array: ");
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
