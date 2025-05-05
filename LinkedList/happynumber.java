package LinkedList;

import java.util.Scanner;


public class happynumber {
    public class ListNode {
        int val;
        ListNode next;
    }
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int num = sc.nextInt();
    public int calcSum(int num);
    {
        int sum = 0;
        while (num>0) {
            sum = sum + (int)Math.pow(num%10,2);
            num = num/10;
        }
       return sum; 
    }
    
    public boolean isHappy(int n) {
    int sum = 0;
    int tempnum = num;
    fast = head;
    slow = head;

    
        while (sum !=  1)
    {
        sum = calcSum(tempnum);
        ListNode node = new ListNode();
        node.val = sum;
        node.next = node;//
        //insert the new node in the end of the node 
        }
    }
    
    

    
}
