public class swap {
    public static void main(String[] args) {
        int a=10,b=20,temp;
        System.out.println("before swapping: ");
        System.out.println("a = "+a+", b = "+b);
        System.out.println("after swapping: ");
        temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+a+", b = "+b);
    }
}
