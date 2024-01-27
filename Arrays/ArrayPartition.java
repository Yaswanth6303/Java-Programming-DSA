import java.util.Scanner;

public class ArrayPartition {
    public static int findArraySum(int [] array){
        int totalSum = 0;
        for (int i = 0;i < array.length;i++){
            totalSum += array[i];
        }
        return totalSum;
    }
    public static boolean equalSumPartition(int [] array){
        int totalSum = findArraySum(array);
        int prefixSum = 0;
        for (int i = 0; i < array.length; i++){
            prefixSum += array[i];
            int suffixSum = totalSum - prefixSum;
            if(suffixSum == prefixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Equal Partition possible: " + equalSumPartition(array));
    }
}
