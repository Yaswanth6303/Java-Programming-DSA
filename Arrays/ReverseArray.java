public class ReverseArray {
    public static void printArray(int [] array){
        for (int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void reverseArray(int [] array){
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void reverseArray1(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int [] array = {8, 4, 3, 2, 7, 9, 11};
        reverseArray(array);
        printArray(array);
        reverseArray1(array);
        printArray(array);
    }
}
