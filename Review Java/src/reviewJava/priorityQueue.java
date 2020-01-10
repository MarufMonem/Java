package reviewJava;
import java.util.Arrays;

public class priorityQueue {
	public static Node prioritize(Node head) {
//		System.out.println("****************Prioritized being called************************"); // when the method is riggered
		int size = head.counting(head); // finding the size of the queue/list
//		System.out.println("This is the size: " + size);
		int array[] = new int[size]; // array for storing the list elements
		int i = 0;
		// all the elements are stored in the array
		for (Node n = head; n != null; n = n.next) {
			array[i] = (int) n.element; // type casting
			i++; // increasing array count
		}
		Arrays.sort(array); // Java buit in array sorting

//		System.out.println("This is what the sorted array looks like: ");		
//		for(int u = 0; u < array.length; u++) {
//			System.out.print(array[u] + " ");
//		}

		Node newHead = new Node(array[0], null);
		for (int p = 1; p < array.length; p++) {
			newHead = queue.addQ(newHead, array[p]); // putting sorted values in the queue
		}

		return newHead; // location of the new queue

	}

	public static void main(String args[]) {

		// implementing queue
		int array[] = { 88, 25, 1, 6, 78, 99, 45, 3 }; // first index is the first value or the first one in the queue
		Node head = new Node(array[0], null); // initiating the first node in the queue
		System.out.print("Head is : ");
		head.print(head); // print the head of the queue

		Node newHead = head;
		for (int i = 1; i < array.length; i++) {
			newHead = queue.addQ(newHead, array[i]); // putting values in the queue
			// we dont need to create instances because its a static method
			newHead = prioritize(newHead); // calling prioritize method every time a new item is inserted to sort based
											// on priority (based on element value)
			// this method is there if the user wants to input something we need to call
			// every time.
		}
		System.out.println("This is what the queue looks like :");
//		newHead = prioritize(newHead); //or if you want to call after creating the whole queue then only use this.
		newHead.print(newHead);
		queue.peekQ(newHead);

//		**************FOR TESTING PURPOSE************
//		newHead = queue.addQ(newHead,0);
//		newHead = prioritize(newHead);
//		newHead.print(newHead);
//		queue.peekQ(newHead);
//		*********************************************
	}

}
