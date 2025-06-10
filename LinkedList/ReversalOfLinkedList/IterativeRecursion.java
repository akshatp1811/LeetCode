public class IterativeRecursion extends RecursionReverse{
    int size = 4;
    public void reverse(ListNode node)
    {
        if(size < 2)
        {
            return;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode nxt = head.next;
        while (pres != null)//I have not traversed the entire linkedlist
        {
            //Reversal of LinkedList
            pres.next = prev;

            //Shifting each pointer one position to right
            prev = pres;
            pres = nxt;
            if (nxt != null) {
                nxt = nxt.next;
            }
        }
        head = prev;
    }
}
