import java.util.Scanner;

public class ReturnFirstValueRepeating {
    public static int firstRepeatingNumber(int [] array){
        for(int i = 0;i < array.length;i++){ //Picks First Number
            for(int j = i + 1;j < array.length;j++){ //Second Number
                if(array[i] == array[j]){
                    return array[i]; //This is the First Repeating value.
                }
            }
        }
        return -1; //In an array if Repeating value is not there return -1.
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
        System.out.println("The First Repeating Value in the array is: " + firstRepeatingNumber(array));
    }
}
