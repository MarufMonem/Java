/** The Question
 * Given 4 coordinates find if its possible to create a rectangle from it.
 */
package therap;
import java.util.*;
/**
 * @author Maruf Monem, BRACU, CS
 * Jan 10, 2020
 */
public class Rectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anik = new Scanner(System.in);
		System.out.println("point 1 coordinate");
		int a = anik.nextInt();
		System.out.println("point 2 coordinate");
		int b = anik.nextInt();
		System.out.println("point 3 coordinate");
		int c = anik.nextInt();
		System.out.println("point 4 coordinate");
		int d = anik.nextInt();
		
//		we need distances from each point
//		ab
//		ac
//		ad		
//		bc
//		bd
//		cd
		
		int array[]= new int[6];
		array[0]=Math.abs(a-b); //ab
		array[1]=Math.abs(a-c); //ac 
		array[2]=Math.abs(a-d); //ad
		array[3]=Math.abs(b-c); //bc
		array[4]=Math.abs(b-d); //bd
		array[5]=Math.abs(c-d); //cd
		int count =0;
		for(int i=0; i < array.length-1;i++) { //looking into each value
			inner: 
				for(int j = i+1; j < array.length;j++) {  // for each value check if the next values have the exact same value.
				if(array[i]==array[j]) {
					count++; // if there is a match we would increase by 1
					break inner;
				}
			}
		if(count == 2) { // we need 2 lines to be the same
			System.out.println("Its a rectangle");
			System.exit(0); // exiting the program
		}
		}
		System.out.println("Not a rectangle");
		
		
	}

}
//sample input
// 2 10 20 12
