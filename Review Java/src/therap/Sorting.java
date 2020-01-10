// The question
// given 1000 numbers having a range of 0 to 99. sort them with a time complexity of O(n) 
// sol : have to use radix or counting sort
//geeks for geeks for better understand the topic
package therap;
/**
 * @author Maruf Monem, BRACU, CS
 * Jan 10, 2020
 */
public class Sorting { //using counting sort

	public static void main(String args[]) {
		int randomNumber[]= new int[1000];
		int sortedNumber []= new int[1001];

		
//		testing with smaller values
//		int randomNumber[]= {1,4,1,2,7,9,2};
//		int sortedNumber [] = new int[8];
		
		
		
		int a[]=new int[100]; // length would be upto the given range
		int count=0; // how many time each number occurs/appears
		for(int i = 0; i < a.length; i++) { //this loop finds that and assigns value of count on the index that represents the number
			for(int j = 0; j < randomNumber.length; j++) {
				if(i == randomNumber[j]) {
					count++;
				}
			}
			a[i]=count;
			count=0; //for new numbers reseting
				
			
		} //O(Kn)

		//modifying the array
		for(int i = 0; i < a.length-1; i++) {
			a[i+1]=a[i]+a[i+1];
		} //O(k)
		
		for(int i = 0; i < randomNumber.length; i++) {
			int p = randomNumber[i]; //traversing the array for values
			System.out.println("p is: " + p);
			int q = a[p]; //

			System.out.println("q is: " + q);
			sortedNumber[q]=p;
			System.out.println("");
			a[p] = a[p]-1;
		} //O(n)
		
		//finally O(Kn + n + k) = O(n)
		for(int i = 1; i < sortedNumber.length; i++) {
			System.out.println("index: "+ i + " : " + sortedNumber[i]);
		}
		

	}
}
