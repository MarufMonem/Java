package reviewJava;

public class queue {

	public static Node addQ(Node head, Object element) {
//		Node n = new Node(element,null);
//		n.next = head;
//		head = n;
//		return head;
		Node newNode = new Node(element, null);
		Node n = null;
		for (n = head; n.next != null; n = n.next) {
			// making n the last element of the list
//			System.out.println(n.element);
		}

		n.next = newNode;
		return head;
	}

	public static Node popQ(Node head) {

		System.out.println("The element that is popped " + head.element);
		Node poppedNode = head;
		head = head.next;
		return head;
	}

	public static Node peekQ(Node head) {
		System.out.println("The top element is " + head.element);
		Node peekedNode = head;
		return peekedNode;

	}

	public static void main(String args[]) {

		// implementing queue
		int array[] = { 88, 25, 1, 6, 78, 99, 45, 3 };
		Node head = new Node(array[0], null); // initiating the first node in the queue

		System.out.print("Head is ");
		head.print(head); // print the head of the queue
		System.out.println("");

		Node newHead = head;
		for (int i = 1; i < array.length; i++) {
			newHead = addQ(newHead, array[i]); // putting values in the queue
		}
		newHead.print(newHead);// printing the new queue
		System.out.println("");
		Node peekedNode = peekQ(head);// looking at the top of the queue
		newHead = popQ(newHead);
		newHead.print(newHead);// printing the new queue

	}

}
