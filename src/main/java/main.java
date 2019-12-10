public class main {
    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i * columns + j + 1;
            }
        }
        print(matrix);
        int[][] newMatrix = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            new Transposer(matrix, newMatrix, i).start();
        }
        System.out.println();
        print(newMatrix);
    }

    static void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transposeMatrix(int[][] matrix){
        int[][] temp = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                temp[j][i] = matrix[i][j];
        return temp;
    }
}
