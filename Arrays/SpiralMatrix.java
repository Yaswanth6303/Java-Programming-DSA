public class SpiralMatrix {
    public static void spiralMatrix(int [][] matrix){
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol){
            //Top
            //Row is fixed Col values is changing so for col variable j.
            for (int j = startCol;j <= endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //Right
            //Last Col is fixed in col we are changing values means we are
            //changing values of last row.
            for (int i = startRow;i <= endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //Bottom
            //Ending Row is fixed Col values is changing.
            for (int j = endCol - 1;j >= startCol;j--){
                if (startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //Left
            //Starting col is fixed we are changing value of row
            for (int i = endRow - 1;i >= startRow + 1;i--){
                if (startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16}};
        spiralMatrix(matrix);
    }
}
