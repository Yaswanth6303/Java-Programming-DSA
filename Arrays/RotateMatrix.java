import java.util.Scanner;

public class RotateMatrix {
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
            for (int j = i;j < r;j++){ //Here j = i because we are not checking whole matrix we are checking half matrix
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void reverseArray(int [] array){
        int first_index = 0,last_index = array.length-1;
        while (first_index < last_index){
            int temp = array[first_index];
            array[first_index] = array[last_index];
            array[last_index] = temp;
            first_index++;
            last_index--;
        }
    }
    //Here n is the only parameter because r,c values are same taken as n.
    public static void rotate(int [][] matrix,int n){
        // transpose
        // reverse each row of transposed matrix
        findTransposeOptimised(matrix, n, n);
        for (int i = 0;i < n;i++){
            // 1,2,3  This is 1D Array Reverse This 3,2,1
            // 4,5,6  6,5,4
            // 7,8,9  9,8,7
            reverseArray(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("'Note':- Here No.of Rows and Columns should be same");
        System.out.println("Enter Number of Rows");
        int r = sc.nextInt();
        System.out.println("Enter Number of Columns");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r * c + " elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println();
        System.out.println("Rotated Matrix");
        rotate(matrix,r); //r =c =n
        printMatrix(matrix);
    }
}
