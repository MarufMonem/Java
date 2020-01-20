package starLab;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a number");
		int userVal = anik.nextInt();
		
		for(int i = 1; i <= userVal;i++) {
			System.out.print(i);
		}
		for(int i = userVal-1; i >=1;i--) {
			System.out.print(i);
		}
		
	}

}
