package reviewJava;
public class Node {
	public Object element;
	public Node next;

	// constructor
	public Node(Object element, Node n) {
		next = n;
		this.element = element;
	}

	// count method
	public int counting(Node head) {
		int counter = 0; // keeps track of the number of nodes
		for (Node n = head; n != null; n = n.next) { // traversing the list
			counter++;
		}
		return counter;
	}

	// get item method
	public Node getNode(Node head, int index) {
		Node n = head;
		for (int i = 0; i < index; i++, n = n.next) { // traversing the list
			// i goes upto the previous node
			// n becomes the desired node
		}
		return n;
	}

	// get item index method
	public int getItemIndex(Node head, Object elememnt) {
		int counter = 0;
		for (Node n = head; n != null; n = n.next) { // traversing the list
			if (n.element.equals(elememnt)) {
				return counter;
			}
			counter++;
		}
		return -1; // if there isnt any element
	}

	// add method
	public Node addNode(Node head, Object element, int index, int size) {
		if (index < 0 || index > size) {
			System.out.print("Invalid");
			return head;
		} else {
			if (index == 0) {
				// replace the head
				Node n = new Node(element, head);
				head = n;
			} else {
				// we need to find the previous node of the index
				Node prevNode = getNode(head, index - 1);
				Node newNode = new Node(element, prevNode.next);
				prevNode.next = newNode;

				System.out.println("Added");

			}
		}
		return head;
	}

	// remove method
	public Node removeNode(Node head, int index, int size) {
		if (index < 0 || index > size) {
			System.out.print("Invalid");
			return head;
		} else {
			if (index == 0) {
				// replace the head
				head = head.next;

			} else {
				// we need to find the previous node of the index
				Node prevNode = getNode(head, index - 1);
				// System.out.println("prev Node" + prevNode.element);
				Node currentNode = getNode(head, index);
				// System.out.println("current Node" + currentNode.element);
				prevNode.next = currentNode.next;

				System.out.println("Removed");

			}
		}
		return head;
	}

	// printing
	public void print(Node head) {
		for (Node n = head; n != null; n = n.next) {
			System.out.print(n.element + " ");
		}
		System.out.println(" ");
	}

	// reversing
	public Node reverse(Node head) {
		Node newHead = null;
		Node newTail = null;

		for (Node n = head; n != null; n = n.next) {
			Node newNode = new Node(n.element, null);
			if (n == head) {
				newHead = newNode;
				newTail = newNode;
			} else {
				newNode.next = newHead;
				newHead = newNode;
			}
		}
		return newHead;
	}

}
