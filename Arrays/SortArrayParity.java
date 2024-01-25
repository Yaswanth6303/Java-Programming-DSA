import java.util.Scanner;

public class SortArrayParity {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sortArraybyParity(int[] array) {
        int n = array.length;
        int first_index = 0, last_index = array.length-1;
        while (first_index < last_index) {
            if (array[first_index] % 2 == 1 && array[last_index] % 2 == 0) {
                swap(array, first_index, last_index);
                first_index++;
                last_index--;
            }
            if (array[first_index] % 2 == 0) {
                first_index++;
            }
            if (array[last_index] % 2 == 1) {
                last_index--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        printArray(array);
        sortArraybyParity(array);
        System.out.println("Sorted Array");
        printArray(array);
    }
}