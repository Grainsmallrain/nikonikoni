public class leetcode0701_2{
	
	 // Definition for singly-linked list.
	 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     	ListNode newhead = new ListNode(0);
     ListNode head=newhead;
	    	int carry=0;
	        while(l1!=null||l2!=null)
	        {
	        	if(l1==null)
	        	{
	        		head.next=new ListNode((l2.val+carry)%10);
	        		carry=(l2.val+carry)/10;
	        		l2=l2.next;
	        	}
	        	else if(l2==null)
	        	{
	        		head.next=new ListNode((l1.val+carry)%10);
	        		carry=(l1.val+carry)/10;
	        		l1=l1.next;
	        	}
	        	
	        	else
	        	{
	        		head.next=new ListNode((l1.val+l2.val+carry)%10);
	        		carry=(l1.val+l2.val+carry)/10;
	        		l1=l1.next;
	        		l2=l2.next;
	        	}
	        	head=head.next;
	        }
	        if(carry>0)
	        	head.next=new ListNode(carry);
	        return newhead.next;
	    }
	
	public static void main()
	{
		
	}
}