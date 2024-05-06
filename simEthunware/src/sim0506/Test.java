package sim0506;

import java.util.Arrays;

class Test {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 1, 0 };
		
		System.out.println(a[(a = b)[3]]);
		//                      a[0]
		
		System.out.println(Arrays.toString(a));
		
		
	}
}