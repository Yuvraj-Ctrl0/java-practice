// 25. Count even numbers in array.
public class CountEven {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,5,7,9,7,6,53,32};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
