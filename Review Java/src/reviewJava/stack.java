package reviewJava;

public class stack {

	public static Node pushSt(Node head, Object element) {
		Node n = new Node(element, null); // creating a new node
		// making the new node the head
		n.next = head;
		head = n;
		return head;
	}

	public static Node popSt(Node head) {

		System.out.println("The element that is popped " + head.element);
		Node poppedNode = head;
		head = head.next;
		return head;
	}

	public static Node peekSt(Node head) {
		System.out.println("The top element is " + head.element);
		Node peekedNode = head;
		return peekedNode;

	}

	public static void main(String args[]) {

		// implementing queue
		int array[] = { 88, 25, 1, 6, 78, 99, 45, 3 };
		Node head = new Node(array[0], null); // initiating the first node in the stack

		System.out.print("First stage head is ");
		head.print(head); // print the head of the newly created stack
		System.out.println("");

		Node newHead = head;
		for (int i = 1; i < array.length; i++) {
			newHead = pushSt(newHead, array[i]); // putting values in the queue
		}
		newHead.print(newHead);// printing the new queue
		System.out.println("");
		Node peekedNode = peekSt(newHead);// looking at the top of the queue
		newHead = popSt(newHead);
		newHead.print(newHead);// printing the new queue

	}

}
