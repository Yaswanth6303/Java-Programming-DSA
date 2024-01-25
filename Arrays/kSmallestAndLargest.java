import java.util.Arrays;
import java.util.Scanner;

public class kSmallestAndLargest {
    public static int [] kSmallestAndLargestElement(int [] array, int k){
        Arrays.sort(array);
        int [] ans = {array[k-1],array[array.length-k]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the Element k: ");
        int k = sc.nextInt();
        int [] ans = kSmallestAndLargestElement(array,k);
        System.out.println(k + "th Smallest element is: " + ans[0]);
        System.out.println(k + "th largest element is: " + ans[1]);
    }
}
