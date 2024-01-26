import java.util.Scanner;

public class SuffixSumInplace {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] makeSuffixSumArray(int [] array){
        int n = array.length;
        for (int i = n - 2;i >= 0;i--){
            array[i] = array[i + 1] + array[i];
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(array);
        int [] suffixArray = makeSuffixSumArray(array);
        System.out.println("Prefix Array");
        printArray(suffixArray);
    }
}

