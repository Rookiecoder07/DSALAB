//Write a Program to find max and min of arrays
public class Exp4 {
int[] findMaxMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }	

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return new int[]{max, min};
    }
    public static void main(String[] args) {
        Exp4 exp4 = new Exp4();
int[] arr = {34, 12, 5, 67, 23, 89, 1, 45};

int[] result = exp4.findMaxMin(arr);
System.out.println("Maximum value: " + result[0]);
System.out.println("Minimum value: " + result[1]);
    }
}


