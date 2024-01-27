import java.util.Scanner;

public class RangeQuerySum {
    public static int [] makePrefixSumArray(int [] array){
        int n = array.length;
        for (int i = 1;i < n;i++){
            array[i] = array[i] + array[i - 1];
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int [] array = new int[n + 1];
        System.out.println("Enter " + n + " elements");
        for (int i = 1;i <= n;i++){
            array[i] = sc.nextInt();
        }
        int [] prefixSumArray = makePrefixSumArray(array);
        System.out.println("Enter Number of Queries");
        int q = sc.nextInt();
        while (q-->0){
            System.out.println("Enter Range");
            System.out.println("Enter 'l'");
            int l = sc.nextInt();
            System.out.println("Enter 'r'");
            int r = sc.nextInt();
            int answer = prefixSumArray[r] - prefixSumArray[l - 1];
            System.out.println("Sum: " + answer);
        }
    }
}
