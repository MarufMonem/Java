package starLab;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a number");
		int userVal = anik.nextInt();
		int k=1;
		//for the rows
		for(int i=userVal; i>=1; i--) {
			
		
			
			//printing spaces
			for(int sp=0; sp<userVal-k;sp++) {
				System.out.print(" ");
			}
			k++;
			
			if(i ==userVal || i == userVal-1 || i == 1) {
				//printing numbers
				for(int j=i; j<=userVal;j++) {
					System.out.print(j);
				}
			}else {
				//printing numbers
				for(int j=i; j<=userVal;j++) {
					
						System.out.print(j);
					
					
				}
			}
			
			
			System.out.println("");
		}
	}

}
