import java.util.Scanner;

public class SortZerosOnes {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] sortZerosAndOnes(int [] array) {
        int n = array.length;
        int count_zeros = 0;
        //0 to zeros-1 = 0; zeros to n - 1 = 1
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count_zeros++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(i < count_zeros){
                array[i] = 0;
            }else {
                array[i] = 1;
            }
        }
        return array;
    }
    public static void sortZerosAndOnesInplace(int [] array) {
        int n = array.length;
        int count_zeros = 0;
        //0 to zeros-1 = 0; zeros to n - 1 = 1
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count_zeros++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(i < count_zeros){
                array[i] = 0;
            }else {
                array[i] = 1;
            }
        }
    }
    public static void swap(int [] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void sortZerosAndOnesPointers(int [] array) {
        int n = array.length;
        int first_index = 0, last_index = n - 1;
        while (first_index < last_index){
            if (array[first_index] == 1 && array[last_index] ==0){
                swap(array,first_index,last_index);
                first_index++;
                last_index--;
            }
            if(array[first_index]==0){
                first_index++;
            }
            if(array[last_index]==1){
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
        int [] sortedArray = sortZerosAndOnes(array);
        System.out.println("Sorted Array");
        printArray(sortedArray);
        System.out.println("Sorted Array");
        sortZerosAndOnesInplace(array);
        printArray(array);
        System.out.println("Sorted Array");
        sortZerosAndOnesPointers(array);
        printArray(array);
    }
}
