package reviewJava;
import java.util.Scanner;

public class list {
	public static void main(String args[]) {
		Scanner anik = new Scanner(System.in);
		Node head = new Node(0, null);
		Node current = head;
		for (int i = 1; i < 11; i++) {
			Node newNode = new Node(i, null);
			current.next = newNode;
			current = newNode;
		}

		head.print(head);
		System.out.println("");
		Node n = head;
		n = head.removeNode(head, 3, 11);
		head.print(n);
		System.out.println("");
		n = n.addNode(head, 808, 3, 10);
		n.print(n);

		// reverse
		System.out.println("");
		n = head.reverse(head);
		n.print(n);

	}
}
