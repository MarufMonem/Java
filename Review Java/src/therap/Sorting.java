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
		int randomNumber[]= new int[1000];
		int sortedNumber []= new int[1000];
		for(int i = 0; i < randomNumber.length; i++) {
			randomNumber[i] = (int)(Math.random()*100);
			if(i%50==0) {
				System.out.println("");
			}
			System.out.print(randomNumber[i]+",");
		}
		
		//have to use radix or counting sort
		int a[]=new int[100];
		int count=0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < randomNumber.length; j++) {
				if(i == randomNumber[j]) {
					count++;
				}
			}
			a[i]=count;
			count=0;
				
			
		}
		
//		for(int i = 0; i < a.length; i++) {
//			System.out.println("index: "+ i + " :" + randomNumber[i]);
//		}
		//modifying the array
		for(int i = 0; i < a.length-1; i++) {
			a[i+1]=a[i]+a[i+1];
		}
		
		for(int i = 0; i < randomNumber.length; i++) {
			int p = randomNumber[i]; //traversing the array for values
			System.out.println("p is: " + p);
			int q = a[p]; //

			System.out.println("q is: " + q);
			sortedNumber[q]=p;
			a[p] = a[p]-1;
		}
		
		for(int i = 0; i < sortedNumber.length; i++) {
			System.out.println("index: "+ i + " : " + randomNumber[i]);
		}
		
	}
}
