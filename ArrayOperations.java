import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int[] arr = new int[100]; // fixed size array
        int n, pos, val;

        // Input size and elements
System.out.print("Enter number of elements: ");
        n = sc.nextInt();

System.out.println("Enter elements: ");
        for (int i = 0; i< n; i++) {
arr[i] = sc.nextInt();
        }

        // Insertion
System.out.print("\nEnter position to insert (0-" + n + "): ");
pos = sc.nextInt();
System.out.print("Enter value to insert: ");
val = sc.nextInt();

        for (int i = n; i>pos; i--) {
arr[i] = arr[i - 1]; // shift elements right
        }
arr[pos] = val;
        n++;

System.out.print("Array after insertion: ");
        for (int i = 0; i< n; i++) {
System.out.print(arr[i] + " ");
        }

        // Deletion
System.out.print("\n\nEnter position to delete (0-" + (n - 1) + "): ");
pos = sc.nextInt();

        for (int i = pos; i< n - 1; i++) {
arr[i] = arr[i + 1]; // shift elements left
        }
        n--;

System.out.print("Array after deletion: ");
        for (int i = 0; i< n; i++) {
System.out.print(arr[i] + " ");
        }

sc.close();
    }
}


