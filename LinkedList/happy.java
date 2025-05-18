import java.util.Scanner;

public class happy {

    // Function to calculate sum of squares of digits
    int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }

    // Node class for linked list (not strictly necessary, but kept as per original structure)
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Create a new node
    Node createNode(int val) {
        return new Node(val);
    }

    // Check if the number is a happy number using cycle detection
    boolean isHappy(int num) {
        Node slow = createNode(num);
        Node fast = createNode(num);

        while (true) {
            slow = createNode(sum(slow.val));                  // move slow by 1 step
            fast = createNode(sum(sum(fast.val)));             // move fast by 2 steps

            if (slow.val == 1 || fast.val == 1)
                return true;   // reached 1, it's a happy number

            if (slow.val == fast.val)
                return false;  // cycle detected, not a happy number
        }
    }

    // Main method to take input and run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        happy obj = new happy();

        System.out.print("Enter a number to check if it's a happy number: ");
        int num = sc.nextInt();

        boolean result = obj.isHappy(num);

        if (result)
            System.out.println(num + " is a Happy Number.");
        else
            System.out.println(num + " is NOT a Happy Number.");

        sc.close();
    }
}
