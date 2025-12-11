//Given sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
public class Exp11 {
    static int[] findFirstAndLast(int[] arr, int x) {
        int first = -1, last = -1;
        int left = 0, right = arr.length - 1;

        // Find first occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                first = mid;
                right = mid - 1; // continue searching in the left half
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Reset search boundaries for last occurrence
        left = 0;
        right = arr.length - 1;

        // Find last occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                last = mid;
                left = mid + 1; // continue searching in the right half
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{first, last};
    }
    public static void main(String[] args) {
int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;
int[] result = findFirstAndLast(arr, x);
System.out.println("First occurrence of " + x + " is at index: " + result[0]);
System.out.println("Last occurrence of " + x + " is at index: " + result[1]);
    }
}
