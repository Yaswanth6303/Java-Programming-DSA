public class BinarySearch {
    public static int binarySearch(int [] array, int key){
        int start = 0;
        int end = array.length - 1;
        /*This is the single element in the array where start
         is at the same place and end is at the same place */
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == key){
                return mid;
            }
            if (array[mid] < key){ //Right
                start = mid + 1;
                end = array.length - 1;
            }else { //Left
                start = 0;
                end = mid - 1;
            }
        }
        return -1; //Key does not exist.
    }
    public static void main(String[] args) {
        int [] array = {8, 1, 5, 7, 4, 6, 7, 5};
        int key = 5;
        System.out.println("The key found at the index: "+binarySearch(array,key));
    }
}
