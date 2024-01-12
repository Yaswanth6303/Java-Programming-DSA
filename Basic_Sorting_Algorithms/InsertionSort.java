public class InsertionSort {
    public static void printArray(int [] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void insertionSort(int [] array){
        for (int i = 1; i < array.length;i++){
            int curr = array[i];
            int prev = i - 1;
            //Finding out the correct position to insert.
            while (prev >= 0 && array[prev] > curr){
                array[prev + 1] = array[prev];
                prev--;
            }
            //insertion
            array[prev + 1] = curr;
        }
    }
    public static void main(String[] args) {
        int [] array = {5, 4, 1, 3, 2};
        insertionSort(array);
        printArray(array);
    }
}
