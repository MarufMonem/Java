package starLab;
import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a number");
		int userVal = anik.nextInt();
		for(int i=1; i <= userVal;i++ ) {
			System.out.println("");
			for(int j =1; j<=i;j++) {
				System.out.print(j);
			}
			
		}

	}

}
