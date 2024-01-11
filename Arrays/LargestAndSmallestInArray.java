public class LargestAndSmallestInArray {
    public static int getLargest(int [] array){
        int largest = Integer.MIN_VALUE; //-Infinity

        for (int i = 0;i < array.length;i++){
            if (largest < array[i]){
                largest = array[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int [] array){
        int smallest = Integer.MAX_VALUE; //+Infinity

        for (int i = 0;i < array.length;i++){
            if (smallest > array[i]){
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int [] numbers = {2, 4, 6, 8, 10};
        System.out.println("Largest Number in the array is: "+getLargest(numbers));
        System.out.println("Smallest Number in the array is: "+getSmallest(numbers));
    }
}
