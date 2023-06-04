public class ex2 {


    public static int calculateMagicSum(int[][] matrix) {
        int size = matrix.length;
        int magicSum = 0;
        for (int i = 0; i < size; i++) {
            magicSum += matrix[0][i];
        }
        return magicSum;
    }

    public static boolean checkMagicSquare(int[][] matrix) {
        int size = matrix.length;
        int magicSum = calculateMagicSum(matrix);

        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }

        for (int i = 0; i < size; i++) {
            int colSum = 0;
            for (int j = 0; j < size; j++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                return false;
            }
        }

        int diagonalSum = 0;
        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
        }
        if (diagonalSum != magicSum) {
            return false;
        }

        int secondaryDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            secondaryDiagonalSum += matrix[i][size - 1 - i];
        }
        if (secondaryDiagonalSum != magicSum) {
            return false;
        }

        return true;
    }

        public static void main (String[]args){
            int[][] matrix = {
                    {16, 3, 2, 13},
                    {5, 10, 11, 8},
                    {9, 6, 7, 12},
                    {4, 15, 14, 1}
            };

            boolean isMagicSquare = checkMagicSquare(matrix);

            if (isMagicSquare) {
                System.out.println("The matrix is a magical square.");
            } else {
                System.out.println("The matrix is not a magical square.");
            }
        }
    }
