import java.util.Scanner;

public class Main {

    // Method Prototype
    public static boolean isArmstrong(int n) {
        // Write logic here
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();

        // Function Call
        if (isArmstrong(n)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}