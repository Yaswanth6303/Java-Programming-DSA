public class SearchInSortedMatrix {
    public static boolean staircaseSearch(int [][] matrix,int key){
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == key){
                System.out.println("Found Key at ("+row+","+col+")");
                return true;
            } else if (matrix[row][col] > key) {
                col--;
            }else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static boolean staircaseSearch1(int[][] matrix, int key) {
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("Found Key at (" + row + "," + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                row--;
            } else {
                col++;
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int [][] matrix = {{10, 20, 30, 40},
                           {15, 25, 35, 45},
                           {27, 39, 37, 48},
                           {32, 33, 39, 50}};
        int key = 30;
        staircaseSearch(matrix, key);
        staircaseSearch1(matrix, key);
    }
}
