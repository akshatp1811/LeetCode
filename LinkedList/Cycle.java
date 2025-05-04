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
        public void insert(List)
         public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast != slow) {
                fast = fast.next.next;
                slow = slow.next;
            }
            if (fast == slow) {
                return true;
            }
            else
            return false;
     }
}