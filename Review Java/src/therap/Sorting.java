// The question
// given 1000 numbers having a range of 0 to 99. sort them with a time complexity of O(n) 
package therap;
/**
 * @author Maruf Monem, BRACU, CS
 * Jan 10, 2020
 */
public class Sorting {
	public static void countingSort(int array[]) {
		
	}
	public static void main(String args[]) {
		int a[]= new int[1000];
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.println("index: "+ i + " :" + a[i]);
		}
		
		//have to use radix or counting sort
	}
}
