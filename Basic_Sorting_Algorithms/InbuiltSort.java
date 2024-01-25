import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void printArray(int [] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArray1(Integer [] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] array = {5, 4, 1, 3, 2};
        Arrays.sort(array);
        printArray(array);
        //The below syntax will print in reverse order. If you write int it will
        //not work, but you want to change to Integer because reverse order will
        //work only on objects.
        Integer [] array2 = {5, 4, 1, 3, 2};
        Arrays.sort(array2, Collections.reverseOrder());
        printArray1(array2);
        int [] array1 = {5, 4, 1, 3, 2};
        Arrays.sort(array1, 0 , 3);
        printArray(array1);
        Integer [] array3 = {5, 4, 1, 3, 2};
        Arrays.sort(array3,0 ,3, Collections.reverseOrder());
        printArray1(array3);
    }
}
