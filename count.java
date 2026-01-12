// 13. Count digits
public class count {
    public static void main(String[] args) {
        int num=16384, count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}
