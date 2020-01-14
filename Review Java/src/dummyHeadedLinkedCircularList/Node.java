package dummyHeadedLinkedCircularList;

public class Node {
	public Object element;
	public Node next;
	public Node prev;
	
	public Node(Object element, Node next, Node prev) { // constructor
		this.element = element;
		this.next = next;
		this.prev=prev;
	}
	
	public static Node insert(Node head, Object element) { // inserting new element into the list

			Node n = new Node(element,null, null);
			// next node would be head
			// and the previous one would be the last node of the previous list
			Node p = head.prev; //last node would the new nodes previous node
			p.next = n; // prev last node next would be the new node
			n.prev = p; // new node previous node would be the last node of prev list
			n.next = head; // new nodes next would be head thus circular
			head.prev = n; // same concept
			return head;
//		}
		
	}
	
	public  Node remove(Node head, Object element) { // remove the element you want
		for(Node n = head; n.next!=head; n=n.next) {
			if(n.element == element) { //checks up to the 2nd last node
				Node p = n.prev;
				Node q = n.next;
				p.next=q;
				q.prev=p;
			}
		}
		
		if(head.prev.element == element) { // checking the last node
			Node n = head.prev; // node that we want to remove
			Node p = n.prev;
			Node q = n.next;
			p.next=q;
			q.prev=p;
		}
		return head;
	}
	
	public void print(Node head) {
		for(Node n = head; n.next!=head; n=n.next) {
			System.out.print(n.element + " ");
			}
		System.out.println(head.prev.element); //printing the last node
		System.out.println(" ");
	}
	
	public Node getNode(Node head,Object element) {
		for(Node n = head; n.next!=head; n=n.next) {
			if(n.element == element) {
				return n;
			}
	}
		if(head.prev.element == element) {
			return head.prev;
		}else {
			System.out.println("No such node found");
			return null;
		}
		
	}
	
	public int size(Node head) {
		int count=0;
		for(Node n = head; n.next!=head; n=n.next) {
			count++;
		}
		count++; // for the last node;
		return count;
	}
}