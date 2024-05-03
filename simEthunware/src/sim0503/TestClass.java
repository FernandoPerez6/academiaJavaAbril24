package sim0503;

//What will be the result of attempting to compile 
//and run the following class?
public class TestClass {
	public static void main(String args[]) {
		int i = 1;
		i = incr(i);
		System.out.println("i = " + i ); //2
	}

	public static int incr(int n) {
		return ++n; 
	}

}