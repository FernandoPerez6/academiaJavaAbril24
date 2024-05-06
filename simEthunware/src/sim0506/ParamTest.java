package sim0506;

//Consider the following class... 
public class ParamTest {
	
	public static void printSum(int a, Integer b) {
		System.out.println("In mix " + (a + b));
	}
	
	public static void printSum(int a, int b) {
		System.out.println("In int " + (a + b));
	}

	public static void printSum(Integer a, Integer b) {
		System.out.println("In Integer " + (a + b));
	}

	public static void printSum(double a, double b) {
		System.out.println("In double " + (a + b));
	}

	public static void main(String[] args) {
		//printSum(1, new Integer(2));
		//printSum(new Integer(1), new Integer(2));
		printSum(1.0,2.0);
	}
}