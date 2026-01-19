// 24. Linear Search.
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={123,4,56,2342,634,75};
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("The element "+key+" is found at index "+i);
            }
        }
    }
}
