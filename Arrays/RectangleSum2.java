import java.util.Scanner;

public class RectangleSum2 {
    public static void printMatrix(int[][] answerMatrix) {
        for (int i = 0; i < answerMatrix.length; i++) {
            for (int j = 0; j < answerMatrix[i].length; j++) {
                System.out.print(answerMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    //calculate row-wise and column wise sum
    // matrix[i][j] = sumRectangle((0,0) (i,j))
    public static void findPrefixSumMatrix(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        //traverse horizontally to calculate row-wise prefix sum for whole matrix.
        for (int i = 0;i < r;i++){
            for (int j = 1; j < c;j++){
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        //traverse vertically to calculate column-wise sum
        for (int j = 0;j < c;j++){ //Fixing Column
            for (int i = 1;i < r;i++){ //Adding whole row for fixing columns.
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }
    public static int findSum3(int [][] matrix, int l1, int r1, int l2, int r2){
        int ans = 0;
        findPrefixSumMatrix(matrix);
        int sum = 0;
        int top = 0,left = 0,topLeft = 0;
        sum = matrix[l2][r2]; //Total
        if (l1 >= 1) {
            top = matrix[l1 - 1][r2];
        }
        if (r1 >= 1){
            left = matrix[l2][r1 - 1];
        }
        if (l1 >= 1 && r1 >= 1) {
            topLeft = matrix[l1 - 1][r1 - 1];
        }
        ans = sum - top - left + topLeft;
        return ans;
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
        System.out.println("Rectangle sum is: " + findSum3(matrix,l1,r1,l2,r2));
    }
}
