import java.util.Scanner;

public class GetIthBit {
    public static int getIthBit(int n, int i){
        int bitMast = (1 << i);
        if ((n & bitMast) == 0){
            return 0;
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter the ith position");
        int i = sc.nextInt();
        System.out.println("For the given integer "+ n +" the ith position of value is: "+getIthBit(n,i));
    }
}
