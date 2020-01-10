//Given a number you have to find the sum of each digit using recursion. 4321 would sum  to be 10
package therap;
/**
 * @author Maruf Monem, BRACU, CS
 * Jan 10, 2020
 */
import java.util.*;
public class DigitSumUsingRecursion {
	public static int sum(int array[], int a) {
		int total=0;
		//System.out.println("a is: " + a);
		if(a > 0) {
			total = total + sum(array,a-1) + array[a];
			return total;
		}else {
			total = array[0];
			return total;
		}
	}
	public static void main(String args[]) {
		Scanner anik = new Scanner(System.in);
		System.out.println("Please enter a number");
		String user1[]=anik.nextLine().split("");
		int array[] = new int[user1.length];
		System.out.println("The array looks like: ");
		for(int i =0; i < user1.length; i++) {
			array[i]= Integer.parseInt(user1[i]);
			System.out.println(array[i]);
		}
		
		System.out.println("******************************");
		
		System.out.println("The total is: " + sum(array, array.length-1));
		
		
	}

}
