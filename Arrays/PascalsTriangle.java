import java.util.Scanner;

public class PascalsTriangle {
    public static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) { //Row
            for (int j = 0; j < matrix[i].length; j++) { //Column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); //After j loop new line will print here.
        }
    }
    public static int [][] pascalTriangle(int n){
        int [][] answerMatrix = new int[n][]; //Row is fixed
        for (int i = 0;i < n;i++){ //n = answerMatrix.length
            //ith row has i+1 columns
            answerMatrix[i] = new int[i + 1];
            /*
                  Row          Column
            answerMatrix[0] = new int[1];
            answerMatrix[1] = new int[2];
            */
            //1st element and last element of every row is 1
            answerMatrix[i][0] = answerMatrix[i][i] = 1;
            for (int j = 1; j < i; j++){
            /*Here j = 1 because we initialize answerMatrix[i][0] = 1 and j < i
            because we initialize answerMatrix[i][i] = 1. Already column is initialized */
                answerMatrix[i][j] = answerMatrix[i - 1][j] + answerMatrix[i - 1][j - 1];
            }
        }
        return answerMatrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int [][] answerArray = pascalTriangle(n);
        printMatrix(answerArray);
    }
}
