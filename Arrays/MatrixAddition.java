import java.util.Scanner;

public class MatrixAddition {
    public static void printMatrix(int [][] array){
        for (int i = 0;i < array.length;i++){ //Row
            for (int j = 0;j < array[i].length;j++){ //Column
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); //After j loop new line will print here.
        }
    }
    public static void add(int [][] a,int r1, int c1, int [][] b,int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong input - Addition not Possible");
            return;
        }
        int [][] sum = new int [r1][c1]; //Initially it is 0.
        for (int i = 0;i < r1;i++){ //r1 = sum.length
            for (int j = 0;j < r2;j++){ //r2 = sum[i].length
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows for Matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter Number of Columns for Matrix 1");
        int c1 = sc.nextInt();
        int [][] a = new int [r1][c1]; //6 elements
        System.out.println("Enter " + r1*c1 + " elements");
        for (int i = 0;i < r1;i++){ //r1 = a.length
            for (int j = 0;j < c1;j++){ //c1 = a[i].length
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Number of Rows for Matrix 2");
        int r2 = sc.nextInt();
        System.out.println("Enter Number of Columns for Matrix 2");
        int c2 = sc.nextInt();
        int [][] b = new int [r2][c2]; //6 elements
        System.out.println("Enter " + r2*c2 + " elements");
        for (int i = 0;i < r2;i++){ //r2 = b.length
            for (int j = 0;j < c2;j++){ //c2 = b[i].length
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);
        System.out.println("Adding Matrix 1 and Matrix 2");
        add(a,r1,c1,b,r2,c2);
    }
}
