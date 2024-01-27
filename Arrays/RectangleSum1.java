import java.util.Scanner;

public class RectangleSum1 {
    public static void printMatrix(int[][] answerMatrix) {
        for (int i = 0; i < answerMatrix.length; i++) {
            for (int j = 0; j < answerMatrix[i].length; j++) {
                System.out.print(answerMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void findPrefixSumMatrix(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        //traverse horizontally to calculate row-wise prefix sum for whole matrix.
        for (int i = 0;i < r;i++){
            for (int j = 1; j < c;j++){
                matrix[i][j] = matrix[i][j] + matrix[i][j - 1]; //This is 1D Array in Matrix
            }
        }
    }
    public static int findSum2(int [][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        findPrefixSumMatrix(matrix);
        for (int i = l1; i <= l2; i++){
            //r1 to r2 sum for row i
            if(r1 >= 1){
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            }else { //When r1 = 0 this case is applicable.
                sum += matrix[i][r2];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int r = sc.nextInt();
        System.out.println("Enter Number of Columns");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r * c + " elements");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println();
        System.out.println("Enter Rectangle Boundaries");
        System.out.println("Enter l1: ");
        int l1 = sc.nextInt();
        System.out.println("Enter r1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter l2: ");
        int l2 = sc.nextInt();
        System.out.println("Enter r2: ");
        int r2 = sc.nextInt();
        System.out.println("Rectangle sum is: " + findSum2(matrix,l1,r1,l2,r2));
    }
}
