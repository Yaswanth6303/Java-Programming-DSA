public class SelectionSort {
    public static void printArray(int [] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void selectionSort(int [] array){
        for (int i = 0; i < array.length - 1;i++){
            int minValueposition = i;
            for (int j = i + 1; j < array.length;j++){
                if (array[minValueposition] > array[j]){
                    minValueposition = j;
                }
            }
            //swap
            int temp = array[minValueposition];
            array[minValueposition] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
        int [] array = {5, 4, 1, 3, 2};
        selectionSort(array);
        printArray(array);
    }
}
