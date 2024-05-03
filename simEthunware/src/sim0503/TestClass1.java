package sim0503;

//What will be the result of attempting to compile and run the following class?
public class TestClass1 {
	public static void main(String args[]) {
		int[] iArr = { 1 };
		incr(iArr);
		System.out.println("iArr[0] = " + iArr[0]);
	}

	public static void incr(int[] n) {
		n = new int[]{ 1 };
		n[0]++;
	}
}