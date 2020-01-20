package starLab;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a row");
		int userRow = anik.nextInt();
		System.out.println("Give a row");
		int userCol = anik.nextInt();
		
//first line
		for(int j=1; j<=userCol;j++) {
			System.out.print(j);
		}
		
		System.out.println("");
		for(int i=2; i < userRow;i++ ) {
		
			for(int j=1; j<=userCol;j++) {
				if(j>1 && j <userCol) {
					System.out.print(" ");
				}else {
					System.out.print(j);
				}
				
			}
			System.out.println("");
		}
		//last line
		for(int j=1; j<=userCol;j++) {
			System.out.print(j);
		}
		System.out.println("");

	}

}
