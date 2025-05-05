package LinkedList;


public class LengthOfCycle {

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
            node8.next = node5; // Creating the cycle
    
            return node1; // Head of the list
        }
        public int lengthCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
    
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    // calculate the length
                    ListNode temp = slow;
                    int length = 0;
                    do {
                        temp = temp.next;
                        length++;
                    } while (temp != slow);
                    return length;
                }
            }
            return 0;
        }
        ListNode head = createCyclicList();
        int Answer = lengthCycle(head);
        int count = Answer;
        ListNode CycleStart(ListNode head){
        ListNode first = head;
        ListNode second = head;
        while(count != 0)
        {
            second =  second.next;
            count--;

        }
        while(first != second)
        {
            first = first.next;
            second = second.next;
        }
        return first;
    }
        public static void main(String[] args) {
        LengthOfCycle LL = new LengthOfCycle();
        ListNode head = LL.createCyclicList();
        int Answer1 = LL.lengthCycle(head);
        // System.out.println(Answer1);
        ListNode Start = LL.CycleStart(head);
        System.out.println(Start.val);
     }
}

//Submission 

// public class Solution {

//     public ListNode detectCycle(ListNode head) {
//         int length = 0;
//             ListNode fast = head;
//             ListNode slow = head;
    
//             while (fast != null && fast.next != null) {
//                 fast = fast.next.next;
//                 slow = slow.next;
//                 if (fast == slow) {
//                     // calculate the length
//                     ListNode temp = slow;
//                     do {
//                         temp = temp.next;
//                         length++;
//                     } while (temp != slow);
//                      break;
//                 }
//             }
//             if(length == 0)
//             {
//                 return null;
//             }
//         else
//         {    
//         ListNode first  =  head;         
//         ListNode second = head;
//         while (length != 0) {
//             second = second.next;
//             length--;
//         }
//         while (first != second) {
//             first = first.next;
//             second = second.next;
            
//         }
//         return first;
//         }
//     }
// }