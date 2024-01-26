import java.util.Scanner;

public class PrefixSum {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] makePrefixSumArray(int [] array){
        int n = array.length;
        int [] prefixArray = new int[n];
        prefixArray[0] = array[0];
        for (int i = 1;i < n;i++){
            prefixArray[i] = prefixArray[i - 1] + array[i];
        }
        return prefixArray;
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
        int [] prefixArray = makePrefixSumArray(array);
        System.out.println("Prefix Array");
        printArray(prefixArray);
    }
}
