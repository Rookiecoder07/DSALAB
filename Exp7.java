//Write a program to implement Tower of Hanoi problem.
public class Exp7 {
    static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
towerOfHanoi(n - 1, source, auxiliary, destination);
System.out.println("Move disk " + n + " from " + source + " to " + destination);
towerOfHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
System.out.println("Tower of Hanoi solution for " + n + " disks:");
towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }
}
