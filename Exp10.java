
// Write a program to implement Binary search in an array.
public class Exp10 {
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }
            if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 70;
        int result = binarySearch(arr, target);
        if (result != -1) {
System.out.println("Element " + target + " found at index: " + result);
        } else {
System.out.println("Element " + target + " not found in the array.");
        }   
    }
}
