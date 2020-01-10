package reviewJava;
import java.util.Scanner;

public class inserting {
	public static void main(String args[]) {
		Scanner anik = new Scanner(System.in);
		System.out.println("Please give the index number");
		int index = 2;
		System.out.println("Please give the index value");
		int value = 88;

		// array
		int[] array = { 4, 2, 8, 6, 0 };
		System.out.println("array length " + array.length);
		// total number of items
		int size = 4;
		// length of the array
		int lastIndex = array.length - 1;// 4
		for (int i = size - 1; lastIndex != index; i--) {
			array[lastIndex] = array[i];// shifting to the right
			System.out.println("last value is: " + array[lastIndex]);
			lastIndex--;
		}
		array[index] = value;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}
