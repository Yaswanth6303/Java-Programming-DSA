import java.util.Scanner;

public class SortArraySquares {
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
    public static void reverse(int [] array){
        int first_index = 0,last_index = array.length-1;
        while (first_index < last_index){
            swap(array,first_index,last_index);
            first_index++;
            last_index--;
        }
    }
    public static int [] sortSquares(int [] array) {
        int n = array.length;
        int first_index = 0, last_index = array.length - 1;
        int [] answerArray = new int[n];
        int k = 0; //Here k is assigning values to answer array.
        while (first_index <= last_index){
            if(Math.abs(array[first_index]) > Math.abs(array[last_index])){
                answerArray[k] = array[first_index] * array[first_index];
                k++;
                first_index++;
            }else {
                answerArray[k] = array[last_index] * array[last_index];
                k++;
                last_index--;
            }
        }
        return answerArray;
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
        int [] answerArray = sortSquares(array);
        System.out.println("Sorted Array");
        System.out.println("Decreasing order");
        printArray(answerArray); //Non-Increasing order
        System.out.println("Increasing order");
        reverse(answerArray); //Non-Decreasing order
        printArray(answerArray);
    }
}
