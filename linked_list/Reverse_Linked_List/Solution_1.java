package linked_list.Reverse_Linked_List;

class ListNode{
	int val;
	ListNode next;
	
	ListNode(){
		
	}
	
	ListNode(int val) {
		this.val = val;
	}
	
	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Solution_1{
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode previousNode = null;
		
		while(head.next != null) {
			ListNode nextNode = head.next;
			head.next = previousNode;
			previousNode = head;
			head = nextNode;
		}
		
		head.next = previousNode;
		return head;
	}
}