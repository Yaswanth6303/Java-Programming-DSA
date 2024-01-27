import java.util.Scanner;

public class TransposeMatrix {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) { //Row
            for (int j = 0; j < matrix[i].length; j++) { //Column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); //After j loop new line will print here.
        }
    }
    public static void findTransposeOptimised(int[][] matrix, int r, int c) {
        for (int i = 0;i < c;i++){
            for (int j = i;j < r;j++){ //Here j = i bcoz we are not checking whole matrix we are checking half matrix
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static int [][] findTranspose(int [][] matrix,int r,int c) {
        int[][] answerArray = new int[c][r];
        for (int i = 0; i < c; i++) {  //For Rows (Transposed)
            for (int j = 0;j < r;j++){  //For Columns (Transposed)
                answerArray[i][j] = matrix[j][i];
            }
        }
        return answerArray;
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
        System.out.println("Transpose Matrix");
        int [][] answerMatrix = findTranspose(matrix, r, c);
        printMatrix(answerMatrix);
    }
}
