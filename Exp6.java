//Write a program to find fibonacci series till a number using iteration and recursion.
public class Exp6 {
    static void fibonacciIterative(int n) {
        int a = 0, b = 1;
System.out.print("Fibonacci series (Iterative) up to " + n + ": ");
        while (a <= n) {
System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
System.out.println();
    }

    static void fibonacciRecursive(int a, int b, int n) {
        if (a > n) {
            return;
        }
System.out.print(a + " ");
fibonacciRecursive(b, a + b, n);
    }

    public static void main(String[] args) {
        int num = 21;
fibonacciIterative(num);
System.out.print("Fibonacci series (Recursive) up to " + num + ": ");
fibonacciRecursive(0, 1, num);
System.out.println();
    }
}

