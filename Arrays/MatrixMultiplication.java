import java.util.Scanner;

public class MatrixMultiplication {
    public static void printMatrix(int [][] array){
        for (int i = 0;i < array.length;i++){ //Row
            for (int j = 0;j < array[i].length;j++){ //Column
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); //After j loop new line will print here.
        }
    }
    public static void multiply(int [][] a,int r1,int c1,int [][] b,int r2,int c2){
        if(c1 != r2){
            System.out.println("Wrong input - Multiplication not Possible");
            return;
        }
        int [][] multiplicationArray = new int[r1][c2]; //Out Mul array will be r1 * c2
        for (int i = 0;i < r1;i++){ //Row Number, r1 = multiplicationArray.length
            for (int j = 0;j < c2;j++){  //Column Number c2 = multiplicationArray[i].length
                for (int k = 0;k < c1;k++){ //c1 = r2 You can write both r2 and c1.
                //i = 1;j = 0
                //multiplicationArray[i][j] = ith row of a * jth column of b
                    multiplicationArray[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        printMatrix(multiplicationArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows for Matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter Number of Columns for Matrix 1");
        int c1 = sc.nextInt();
        int [][] array = new int [r1][c1]; //6 elements
        System.out.println("Enter " + r1*c1 + " elements");
        for (int i = 0;i < r1;i++){
            for (int j = 0;j < c1;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Number of Rows for Matrix 2");
        int r2 = sc.nextInt();
        System.out.println("Enter Number of Columns for Matrix 2");
        int c2 = sc.nextInt();
        int [][] array2 = new int [r2][c2]; //6 elements
        System.out.println("Enter " + r2*c2 + " elements");
        for (int i = 0;i < r2;i++){
            for (int j = 0;j < c2;j++){
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(array);
        System.out.println("Matrix 2");
        printMatrix(array2);
        System.out.println("Multiplying Matrix 1 and Matrix 2");
        multiply(array,r1,c1,array2,r2,c2);
    }
}
