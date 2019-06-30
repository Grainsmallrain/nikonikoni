public class leetcode0630_1{
	 public class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) { val = x; }
		  }
		    public ListNode removeNthFromEnd(ListNode head, int n) {
		    	ListNode newNode=new ListNode(0);
		    	newNode.next=head;
		        ListNode firstNode=newNode;
		        ListNode secondNode=newNode;
		        for(int i=0;i<n+1;i++)
		        {
		        	firstNode=firstNode.next;
		        }
		        while(firstNode!=null)
		        {
		        	firstNode=firstNode.next;
		        	secondNode=secondNode.next;
		        	
		        }
		        secondNode.next=secondNode.next.next;
		        return newNode.next;
		    }
		
	public static void main(String args[])
	{
		
	}
}