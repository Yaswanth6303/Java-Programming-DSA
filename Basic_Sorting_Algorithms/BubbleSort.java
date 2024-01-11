public class BubbleSort {
    public static void printArray(int [] array){
        for (int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int [] numbers){
        for (int turns = 0;turns < numbers.length - 1;turns++){
            for (int j = 0;j < numbers.length - 1 - turns;j++){
                if (numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] numbers = {5, 4, 1, 3, 2};
        bubbleSort(numbers);
        System.out.print("Sorted Array: ");
        printArray(numbers);
    }
}
