package recursion;
import java.util.Scanner;
public class factorial {

	public static int calculate(int n) {
		int total = 0;
		if(n == 0) {
			return 1;
		}else {
			return (n * calculate(n-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anik = new Scanner(System.in);
		System.out.println("Give a number");
		int userVal = anik.nextInt();
		
		System.out.println(calculate(userVal));
		

	}

}
