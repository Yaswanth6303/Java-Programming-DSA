import java.util.Scanner;

public class RotateAnArrayInplace {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArray(int[] array, int k) {
        int n = array.length;
        k = k % n;

        reverseArray(array, 0, n - k - 1);
        reverseArray(array, n - k, n - 1);
        reverseArray(array, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("Original Array");
        printArray(array);
        System.out.println();
        System.out.println("Array after Rotation");
        rotateArray(array, k);
        printArray(array);
    }
}
