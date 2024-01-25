import java.util.Scanner;

public class SecondLargest {
    public static int getLargestNumber(int [] array){
        int largest = Integer.MIN_VALUE; //i.e., -Infinity
        for (int i = 0;i < array.length;i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }
    public static int getSecondLargestNumber(int [] array){
        int Largest = getLargestNumber(array);
        for (int i = 0;i < array.length;i++){
            if(array[i] == Largest){
                array[i] = Integer.MIN_VALUE; //-Infinity
            }
        }
        int secondMax = getLargestNumber(array);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The Second Largest Number is: " + getSecondLargestNumber(array));
    }
}
