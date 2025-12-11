//Write a program to find factorial of any number using iteration and recursion.
public class Exp5 {
    static int factorialIterative(int n) {
        int result = 1;
        for (int i = 2; i<= n; i++) {
            result *= i;
        }
        return result;
    }
    static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int num = 6;
System.out.println("Factorial of " + num + " using iteration: " + factorialIterative(num));
System.out.println("Factorial of " + num + " using recursion: " + factorialRecursive(num));
    }
}


