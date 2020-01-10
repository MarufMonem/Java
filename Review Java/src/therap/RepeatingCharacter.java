package therap;
//The question
//Given a word find the least occurring character.
import java.util.*;
/**
 * @author Maruf Monem, BRACU, CS
 * Jan 9, 2020
 */
public class RepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a word");
		String user = anik.nextLine();
		char array[]= user.toCharArray();
		int min=99999;
		char ans = '+';
		int count=0;
		for(int i=0; i< array.length; i++) { //looks into each character
			for(int k = 0; k < array.length;k++) { // compares with all the characters in the word
				if(i==k) {
					//do nothing for the same position characters
				}else {
					if(array[i]==array[k]) {
						count++; // if they match we increase counter
					}
				}
				
			}
			
			if(count < min) {
				ans = array[i];
				min = count;				
			}
			count=0;
		}
		System.out.println("Least occuring character is: " + ans);
		
	}

}

