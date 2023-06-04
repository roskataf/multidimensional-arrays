
public class ex4 {

    public static int calculateColumnSum(int[][] matrix, int colIndex) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][colIndex - 1];
        }
        return sum;
    }


    public static void main(String[] args) {

        int[][] matrix = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };

        int sumCol1 = calculateColumnSum(matrix, 1);
        int sumCol3 = calculateColumnSum(matrix, 3);
        int sumCol5 = calculateColumnSum(matrix, 5);

        System.out.println("Сума на елементите в колона 1: " + sumCol1);
        System.out.println("Сума на елементите в колона 3: " + sumCol3);
        System.out.println("Сума на елементите в колона 5: " + sumCol5);
    }
}
