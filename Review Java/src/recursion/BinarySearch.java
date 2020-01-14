package recursion;

public class BinarySearch {
	public static boolean search(int a[], int start, int last, int key) {
		int mid = (start + last)/2;
		if(a[mid] == key) {
			return true;
		}else if(key < a[mid] && key >= a[0]){
			return search(a, start, mid-1,key);
		} else if(key > a[mid] && key <= a[last]) {
			return search (a, mid+1,last,key);
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(search(array,0,array.length-1,12));
	}

}
