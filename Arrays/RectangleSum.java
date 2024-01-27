import java.util.Scanner;

public class RectangleSum {
    public static void printMatrix(int[][] answerMatrix) {
        for (int i = 0; i < answerMatrix.length; i++) {
            for (int j = 0; j < answerMatrix[i].length; j++) {
                System.out.print(answerMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int findSum(int [][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for (int i = l1;i <= l2;i++){
            for (int j = r1;j <= r2;j++){
                sum += matrix[i][j];
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
        System.out.println("Rectangle sum is: " + findSum(matrix,l1,r1,l2,r2));
    }
}
