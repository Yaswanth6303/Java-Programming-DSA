public class MaxSubArraySum {
    //Time Complexity = O(n^3)
    public static void maxSubArraySumBruteForce(int [] array){
        int maxTotalSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0;i < array.length;i++){
            for (int j = i;j < array.length;j++){
                for (int k = i; k <= j;k++){ //k loop will go from start to end start = 2, end = 12
                    System.out.print(array[k]+" "); //Printing sub arrays
                    currSum += array[k];
                }
                System.out.println(":"+currSum);
                if (maxTotalSum < currSum){
                    maxTotalSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum of the Array is: "+maxTotalSum);
    }
    //Time Complexity = O(n^2)
    public static void maxSubArrayPrefixSum(int [] array){
        int currSum = 0;
        int maxTotalSum = Integer.MIN_VALUE;
        int [] prefixSum = new int[array.length];

        //Calculating Prefix Array
        prefixSum[0] = array[0];
        for (int i = 1;i < prefixSum.length;i++){
            prefixSum[i] = array[i] + prefixSum[i - 1];
        }
        for (int i = 0;i < array.length;i++){
            for (int j = i;j < array.length;j++){
                for (int k = i; k <= j;k++){ //k loop will go from start to end start = 2, end = 12
                    System.out.print(array[k]+" "); //Printing sub arrays
                }
                if (i == 0){
                    currSum = prefixSum[j];
                    System.out.println(":"+currSum);
                }else {
                    currSum = prefixSum[j] - prefixSum[i - 1];
                    System.out.println(":"+currSum);
                }
                if (currSum > maxTotalSum){
                    maxTotalSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum of the Array is: "+maxTotalSum);
    }

    //Time Complexity =
    public static void maxSubArrayKadane(int [] array){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0;i < array.length;i++){
            currSum += array[i];
            if (currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Sum of the Sub Array is: "+maxSum);
    }
    public static void maxNegativeSubArraySum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = array[0];
        for (int i = 1; i < array.length; i++) {
            currSum = Math.max(array[i], currSum + array[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Max Sum of the Sub Array is: "+maxSum);
    }
    public static void main(String[] args) {
        int [] array = {1, -2, 6, -1, 3};
        int [] array1 = {2, 4, 6, 8, 10};
        maxSubArraySumBruteForce(array);
        System.out.println();
        maxSubArraySumBruteForce(array1);
        System.out.println("--------------------------------");
        maxSubArrayPrefixSum(array);
        System.out.println();
        maxSubArrayPrefixSum(array1);
        System.out.println("-------------------------------- ");
        int [] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubArrayKadane(numbers);
        System.out.println("-------------------------------- ");
        int[] arr = {-2, -3, -4, -1, -2};
        maxNegativeSubArraySum(arr);
    }
}
