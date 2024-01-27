import java.util.Scanner;

public class PascalTrianglePyramid {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
    public static void printPascalTrianglePyramid(int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print("   "); // Adjust spaces for the pyramid format
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", binomialCoefficient(i, j));
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = sc.nextInt();

        printPascalTrianglePyramid(numRows);
    }
}
