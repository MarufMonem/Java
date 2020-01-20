package starLab;
import java.util.*;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a number");
		int userVal = anik.nextInt();
		
		//for the rows
		for(int i=1; i<=userVal; i++) {
			//printing spaces
			for(int sp=0; sp<userVal-i;sp++) {
				System.out.print(" ");
			}
			
			//printing numbers
			for(int j=1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
	}

}
