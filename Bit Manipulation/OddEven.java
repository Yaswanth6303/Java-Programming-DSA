import java.util.Scanner;

public class OddEven {
    public static void OddOrEven(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of times");
        int n = sc.nextInt();
        while (n > 0){
            System.out.println("Enter an Integer");
            int x = sc.nextInt();
            OddOrEven(x);
            n--;
        }
    }
}
