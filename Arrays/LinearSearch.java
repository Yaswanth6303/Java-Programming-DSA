public class LinearSearch {
    public static int linearSearch(int [] array,int key){
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == key) {
                return i; //return the index of the element in the array
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] numbers = {2, 4, 6, 8, 10};
        int key = 6;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found");
        }else{
            System.out.println("Element is present at index " + index);
        }
    }
}
