public class reverseII extends RecursionReverse{

    public ListNode reverseBetween(ListNode head , int left , int right)
    {
        if(left == right)
        return head;
    }
    ListNode curr = head;
    ListNode prev = null;

    for(int i = 0 ; curr != null && i< l-1;i++)
    {
        prev = curr;
        curr = curr.next;
    }
    ListNode Lprev = prev;
    ListNode newEnd = curr;

    ListNode next = null;


    for(i = 0 ; current != null && i<r-l+1;i++)
    {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    /*our prev has reached the right end of the part
      we wanted to reverse
      Now Connnect Lprev to the new position of prev
      and new end with current Lprev.next
    */
     if (Lprev != null) {
            Lprev.next = prev;
        } else {
            head = prev;  // When reversing starts from the head
        }
    newEnd.next = curr;
    return head;
}
