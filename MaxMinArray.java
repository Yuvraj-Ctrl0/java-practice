// 23. Find max/min in array
public class MaxMinArray {
    public static void main(String[] args) {
        int arr[]={5,32,756,123,8,9,3,8};
        int max=(int)Double.NEGATIVE_INFINITY;
        int min=(int)Double.POSITIVE_INFINITY;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
