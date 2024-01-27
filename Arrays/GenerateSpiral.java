import java.util.Scanner;

public class GenerateSpiral {
    public static void printMatrix(int[][] answerMatrix) {
        for (int i = 0; i < answerMatrix.length; i++) {
            for (int j = 0; j < answerMatrix[i].length; j++) {
                System.out.print(answerMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateSpiralOrder(int n) {
        int[][] answerMatrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftColumn = 0, rightColumn = n - 1;
        int current = 1; // current means printing current values in spiral order
        while (current <= n * n) {
            // Top Row -> Left Column to Right Column
            for (int j = leftColumn; j <= rightColumn && current <= n * n; j++) {
                answerMatrix[topRow][j] = current;
                current++;
            }
            topRow++;
            // Right Column -> Top Row to Bottom Row
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                answerMatrix[i][rightColumn] = current;
                current++;
            }
            rightColumn--;
            // Bottom Row -> Right Column to Left Column
            for (int j = rightColumn; j >= leftColumn && current <= n * n; j--) {
                answerMatrix[bottomRow][j] = current;
                current++;
            }
            bottomRow--;
            // Left Column -> Bottom Row to Top Row
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                answerMatrix[i][leftColumn] = current;
                current++;
            }
            leftColumn++;
        }
        return answerMatrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[][] answerMatrix = generateSpiralOrder(n);
        printMatrix(answerMatrix);
    }
}
