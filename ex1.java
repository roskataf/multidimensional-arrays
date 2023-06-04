public class ex1 {

    public static void movieRating(int[][] movieRating) {
        int filmIndex = 2;

        int sum = 0;
        int numCritics = movieRating.length;

        for (int i = 0; i < numCritics; i++) {
            sum += movieRating[i][filmIndex];
        }

        double averageRating = (double) sum / numCritics;

        System.out.println("The average rating for film #" + (filmIndex + 1) + ": " + averageRating);
    }

    public static void main(String[] args) {
        int[][] movieRating = {
                {4,6,2,5},
                {7,9,4,8},
                {6,9,3,7}
        };

        movieRating(movieRating);
    }
}