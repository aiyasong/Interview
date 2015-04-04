package leetcode;

import common.ListNode;

public class LinkListNodeAdd {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(0);
        if ((l1 == null) || (l2 == null)) {
            return (l2 == null) ? l1 : l2;
        }
        
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode temp = head;
        int carryNumber = 0;
        while ((head1 != null) || (head2 != null)) {
        	int sum = ((head1 == null)?0:head1.val) 
        			+ ((head2 == null)?0:head2.val) 
        			+ carryNumber;
        	
        	temp.next = new ListNode(sum % 10);
        	temp = temp.next;
        	carryNumber = sum % 10;
        	
        	if (head1 != null) {
        		head1 = head1.next;
        	}
        	
        	if (head2 != null) {
        		head2 = head2.next;
        	}
        	
        }
        return head.next;
    }
 
}
