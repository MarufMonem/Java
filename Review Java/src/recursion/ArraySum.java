package recursion;

public class ArraySum {
	
	public static int sum(int a[], int n) {
		if(n == 0) {
			return a[0];
		}else {
			return (a[n]+ sum(a,n-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("sum : " + sum(array,array.length-1) );
		
	}

}
