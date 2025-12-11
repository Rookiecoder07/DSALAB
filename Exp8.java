//You are given an integer n. You have to print all numbers from n to 1 using recursion only.
public class Exp8 {
    static void printNumbers(int n) {
        if (n < 1) {
            return;
        }
System.out.print(n + " ");
printNumbers(n - 1);
    }
    public static void main(String[] args) {
        int n = 10; // You can change this value to test with other numbers
System.out.println("Printing numbers from " + n + " to 1:");
printNumbers(n);
    }
}

