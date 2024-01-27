public class SumOfMatrix {
    public static void rowSum(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0;i < r;i++){
            int rowSum = 0;
            for (int j = 0;j < c;j++){
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of " + (i+1) + " row is: " + rowSum);
        }
    }
    public static void columnSum(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0;i < c;i++){
            int columnSum = 0;
            for (int j = 0;j < r;j++){
                columnSum += matrix[j][i];
            }
            System.out.println("Sum of " + (i+1) + " column is: " + columnSum);
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        rowSum(matrix);
        System.out.println();
        columnSum(matrix);
    }
}
