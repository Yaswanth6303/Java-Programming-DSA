import java.util.Scanner;

public class RotateAnArray {
    public static int [] rotateArray(int [] array, int k){
        int n = array.length;
        k = k % n;
        int [] answerArray = new int[n];
        int j = 0;
        for (int i = n - k; i < n ;i++){
            answerArray[j] = array[i];
            j++;
        }
        for (int i = 0; i < (n - k); i++){
            answerArray[j] = array[i];
            j++;
        }
        return answerArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("Original Array");
        for (int i = 0;i < array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int [] answerArray = rotateArray(array,k);
        System.out.println("Array after Rotation");
        for (int i = 0;i < answerArray.length;i++){
            System.out.print(answerArray[i] + " ");
        }
    }
}
