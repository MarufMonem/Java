package starLab;

import java.util.Scanner;

public class Task10 {

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
			
			if(i==1 || i == userVal) {
				for(int j =1; j <= i+(i-1);j++) {
					System.out.print(j);
				}
			}else {
				
			
			//numbers
			for(int j =1; j <= i+(i-1);j++) {
				if(j==1 || j == i+(i-1)) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
				
			}
			}
			System.out.println("");
			
		}
	}

}
