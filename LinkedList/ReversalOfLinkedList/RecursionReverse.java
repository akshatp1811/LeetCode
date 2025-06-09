public class RecursionReverse {
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }
         ListNode head = null; 
         //Creating new tail variable that will be used in Recursion
         ListNode tail = null;

//-------------------------------------------------------------------------------

    public void insert(int value) {
    ListNode newNode = new ListNode(value);

    if (head == null) {
        head = newNode;
        tail = newNode; // set tail to the new node when list is empty
    } else {
        tail.next = newNode; // attach new node after tail
        tail = newNode;      // move tail to the new node
    }
}
//------------------------------Recursive Reverse Function-------------------------
    public void reverse(ListNode node){
        if(node == tail)
        {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
//------------------------------Public Wrapper Reverse Function-------------------------
public void reverseList() {
    if (head == null || head.next == null) return;
    reverse(head);
}
//-------------------------------------------------------------------------------

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to run the code
    public static void main(String[] args) {
        RecursionReverse LL = new RecursionReverse(); // ✅ Now inside main()

        LL.insert(1);
        LL.insert(2);
        LL.insert(3);
        LL.insert(4);
        LL.printList(); // Optional: To check output
        LL.reverseList();
        LL.printList(); // Optional: To check output
    }
}
