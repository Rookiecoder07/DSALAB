public class Exp2 {
    public static void main(String[] args) {
int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

System.out.print("Original array: ");
        for (int i = 0; i< n; i++) {
System.out.print(arr[i] + " ");
        }
System.out.println();

        // Reverse the array
        for (int i = 0; i< n / 2; i++) {
            int temp = arr[i];
arr[i] = arr[n - 1 - i];
arr[n - 1 - i] = temp;
        }

System.out.print("Reversed array: ");
        for (int i = 0; i< n; i++) {
System.out.print(arr[i] + " ");
        }
    }
}


