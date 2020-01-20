package starLab;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a number");
		int userVal = anik.nextInt();
		for(int i=1; i <= userVal;i++ ) { //for loop main
			if(i == 1 || i == 2 || i == userVal) {
				for(int j =1; j<=i;j++) {
					System.out.print(j);
				}
			}else {
				for(int j =1; j<=i;j++) {
					if(j>1 && j<i) {
						System.out.print(" ");
	
				}else {
					System.out.print(j);
				}
			}
			

			
		}
			System.out.println("");
	}

}
}