public class Exp3 {
    public static void main(String[] args) {
int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };	
int[][] arr2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int rows = arr1.length;
        int cols = arr1[0].length;

        // Addition of two 2D arrays
int[][] sum = new int[rows][cols];
        for (int i = 0; i< rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
System.out.println("Sum of the two arrays:");
        for (int i = 0; i< rows; i++) {
            for (int j = 0; j < cols; j++) {
System.out.print(sum[i][j] + " ");
            }
System.out.println();
        }
        // Multiplication of two 2D arrays
int[][] product = new int[rows][cols];
        for (int i = 0; i< rows; i++) {
            for (int j = 0; j < cols; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
System.out.println("Product of the two arrays:");
        for (int i = 0; i< rows; i++) {
            for (int j = 0; j < cols; j++) {
System.out.print(product[i][j] + " ");
            }
System.out.println();
        }
    }
}
