package LinkedList;
public class LinkedList2 extends LengthOfCycle {
    LengthOfCycle LL2 = new LengthOfCycle();
    int length = LL2.lengthCycle(head);
    public ListNode detectCycle(ListNode head) {
        ListNode first  =  head;         
        ListNode second = head;
        while (length != 0) {
            second = second.next;
            length--;
        }
        while (first != second) {
            first = first.next;
            second = second.next;
            
        }
        return first;
    }
    public static void main(String[] args) {
        LengthOfCycle LL = new LengthOfCycle();
        ListNode head = LL.createCyclicList();
        LinkedList2 LL2 = new LinkedList2();
        ListNode start = LL2.detectCycle(head);
        System.out.println(start.val);
    }
}
