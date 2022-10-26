public class Matrices {
    public static void main(String[] args) {
        int[][] matrices1 = { { 1, 2 }, { 3, 4 } };
        int[][] matrices2 = { { 5, 6 }, { 7, 8 } };
        int[][] matricesSum = addTwoMatrices(matrices1, matrices2);
        printMatrix(matricesSum);
    }

    private static int[][] addTwoMatrices(int[][] matrices1, int[][] matrices2) {
        int[][] matricesSum = new int[matrices1.length][matrices2.length];
        for (int i = 0; i < matrices1.length; i++) {
            for (int j = 0; j < matrices2[i].length; j++) {
                matricesSum[i][j] = matrices1[i][j] + matrices2[i][j];
            }
        }
        return matricesSum;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
