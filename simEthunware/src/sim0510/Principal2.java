package sim0510;

public class Principal2 {

	public static void main(String[] args) {
		 System.out.println(factorial(1_000_000));
		// printMe(null);
		// m2();
	}

	static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}
	// Assume that it is called with a very large integer.

	static void printMe(Object[] oa) {
		for (int i = 0; i <= oa.length; i++)
			System.out.println(oa[i]);
	}

//	Assume that it is called as such: printMe(null);
//
	static Object m1() {
		return new String();
	}

	static void m2() {
		String s = (String) m1();
	}
//	Assume that method m2 is invoked.
}
