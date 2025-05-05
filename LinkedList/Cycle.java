package LinkedList;


public class Cycle {

    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }
         //Creating the cyclic node
         public ListNode createCyclicList() {
            ListNode node1 = new ListNode(1);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(3);
            ListNode node4 = new ListNode(4);
            ListNode node5 = new ListNode(5);
            ListNode node6 = new ListNode(6);
            ListNode node7 = new ListNode(7);
            ListNode node8 = new ListNode(8);
    
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            node5.next = node6;
            node6.next = node7;
            node7.next = node8;
            node8.next = null; // Creating the cycle
    
            return node1; // Head of the list
        }
         public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                return true;
            }
        }
            return false;
     }
     public static void main(String[] args) {
        Cycle LL = new Cycle();
        ListNode head = LL.createCyclicList();
        boolean Answer = LL.hasCycle(head);
        System.out.println(Answer);
     }
}