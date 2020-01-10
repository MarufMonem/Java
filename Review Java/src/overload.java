class check {
	void test() {
		System.out.println("Nothing");
	}

	void test(int a) {
		System.out.print(a);
	}

	void test(double a) {
		System.out.print("double a :" + a);
	}
}

public class overload {
	public static void main(String args[]) {
		int a = 50;
		double b = 50.12;
		char c = 'a';
		String k = "anik";
		check d = new check();
		d.test();
//		d.test(a);
	}

}
