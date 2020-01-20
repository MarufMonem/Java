package starLab;
import java.util.*;

public class Task1 {
	public static void main(String args[]) {
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a number");
		int userVal = anik.nextInt();
		for(int i=1; i <= userVal;i++ ) {
			System.out.print(i);
		}
	}
}
