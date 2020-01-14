package dummyHeadedLinkedCircularList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(null,null,null);
		head.element = 0;
		head.next=head; //This is what makes it circular
		head.prev = head;// ''
		
		for(int i =1; i < 10; i++) {
			head =Node.insert(head, i); //inserting new elements to create a bigger list

		}

		head.print(head);
		Node user = head.getNode(head, 9);
		System.out.println(user.element);
		head.remove(head, 9);
		head.print(head);
	}
	
	

}
