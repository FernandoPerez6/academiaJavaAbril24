package sim2204;

public class Tester {
	static {
		int x = 3;
	}
	static int x; //0

	public static void main(String[] args) {
		x--; // line 7 //-1
		System.out.println(x);
	}
}