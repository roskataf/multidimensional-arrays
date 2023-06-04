import java.util.Scanner;

public class ex3 {


    public static int[][] generateMatrixBackwardsByFives(int n) {
        int[][] matrix = new int[n][n];
        int num = 5;

        for (int row = n-1; row >= 0; row--) {
            for (int col = n-1; col >= 0; col--) {
                matrix[row][col] = num;
                num += 5;
            }
        }

        return matrix;
    }

    public static int[][] generateMatrixByColumns(int n){
        int[][] matrix = new int[n][n];
        int num = 1;

        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = num;
                num ++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int[][] matrixA = generateMatrixByColumns(n);
        printMatrix(matrixA);

        System.out.println("----------------");

        int[][] matrixB = generateMatrixBackwardsByFives(n);
        printMatrix(matrixB);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
