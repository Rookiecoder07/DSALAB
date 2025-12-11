//Write a program to implement linear search in 2D-matrix
public class Exp9 {
    static int[] linearSearch2D(int[][] matrix, int target) {
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j}; // Return the row and column indices
                }
            }
        }
        return new int[]{-1, -1}; // Target not found
    }

    public static void main(String[] args) {
int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int target = 50;
int[] result = linearSearch2D(matrix, target);
        if (result[0] != -1) {
System.out.println("Element " + target + " found at position: (" + result[0] + ", " + result[1] + ")");
        } else {
System.out.println("Element " + target + " not found in the matrix.");
        }
    }
}
