public class DiagonalSum {
    public static int diagonalSum(int [][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0;j < matrix[0].length;j++){
                //Primary Diagonal
                if (i == j){
                    sum = sum + matrix[i][j];
                    //Secondary Diagonal
                } else if (i + j == matrix.length - 1) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int optimizedDiagonalSum(int [][] matrix){
        int sum = 0;
        for (int i = 0;i < matrix.length;i++){
            //Primary Diagonal
            sum = sum + matrix[i][i];
            //Secondary Diagonal
            //i + j == matrix.length - 1 => j = matrix.length - 1 - i
            //If matrix is odd then this if condition is applied
            //When 'i' is not equal to 'j' then only if loop get executed
            if (i != matrix.length - 1 - i){
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(diagonalSum(matrix));
        System.out.println(optimizedDiagonalSum(matrix));
    }
}
