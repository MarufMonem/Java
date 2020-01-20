package starLab;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a row");
		int userRow = anik.nextInt();
		System.out.println("Give a row");
		int userCol = anik.nextInt();

		for(int i=1; i <= userRow;i++ ) {
			System.out.println("");
			for(int j=1; j<=userCol;j++) {
				System.out.print(j);
			}
		}
	}

}
