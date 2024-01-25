public class PrintSubArray {
    public static void printSubArray(int [] array){
        int totalPairs = 0;
        for (int i = 0;i < array.length;i++){
            for (int j = i;j < array.length;j++){
                for (int k = i; k <= j;k++){ //k loop will go from start to end start = 2, end = 12
                    System.out.print(array[k]+" "); //Printing sub arrays
                }
                System.out.println();
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+totalPairs);
    }
    public static void main(String[] args) {
        int [] array = {2, 4, 6, 8, 10, 12};
        printSubArray(array);
    }
}
