package starLab;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a number");
		int userVal = anik.nextInt();
		int last =0;
		
		//rows
		for(int i=1; i<= userVal;i++) {
			//space
			for(int sp=0; sp< userVal-i;sp++) {
				System.out.print(" ");
			}
			//numbers
			for(int j =1; j <= i+(i-1);j++) {
				System.out.print(j);
				last=j;
			}
			System.out.println("");
			
		}
		int p=0;
		last =last-2;
		//next half
		for(int i=1; i< userVal;i++) {
			//space
			for(int sp=0; sp< i;sp++) {
				System.out.print(" ");
			}
			//numbers
			for(int j =1; j <= last-p;j++) {
				System.out.print(j);
			}
			System.out.println("");
			p=p+2;
		}
		

	}

}
