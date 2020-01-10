package therap;
//The question asked to create a program that would check if a given word and its reverse are the same or not.
//for example therap and pareht are the same
import java.util.*;
public class RepeatCheck {
	public static void main(String args[]) {
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a word ");
		String word1 = anik.nextLine();
		System.out.println("Give the reverse of it");
		String word2 = anik.nextLine();
		char firstWord[]=word1.toCharArray();
		char secondWord[]=word2.toCharArray();
		int j = secondWord.length-1;
		
		for(int i = 0; i < firstWord.length; i++) {
				if(firstWord[i]!=secondWord[j]) {
					System.out.println("Not the same word");
					System.exit(0);		//terminating the code			
				}else {
					j--;
				}
			}
		System.out.println("Same word");
		}

}
