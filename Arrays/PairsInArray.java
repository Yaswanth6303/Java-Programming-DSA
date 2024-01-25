public class PairsInArray {
    public static void main(String[] args) {
        int [] array = {2, 4, 6, 8, 10};
        int count = 0;
        for (int i = 0;i < array.length;i++){
            for (int j = i + 1;j < array.length;j++){
                System.out.print("(" + array[i] +"," +array[j]+") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are: "+count);
    }
}
