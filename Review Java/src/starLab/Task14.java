package starLab;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a number");
		int userVal = anik.nextInt();
		
		//rows
		for(int i=1; i<= userVal;i++) {
			//space
			for(int sp=0; sp< userVal-i;sp++) {
				System.out.print(" ");
			}
			//numbers
			int limit = i + (i-1);
			int stop = 1;
			for(int j =1; j <= Math.ceil(limit/2)+1;j++) {
				System.out.print(j);
				stop =j;
			}
			for(int j =stop-1; j >=1;j--) {
				System.out.print(j);
			}
			System.out.println("");
			
		}
	}

}
