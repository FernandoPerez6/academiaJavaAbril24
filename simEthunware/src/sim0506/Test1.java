package sim0506;

class Test1 {
	public static void main(String[] args) {
		int k = 1;
		int[] a = { 1 };
		// k = k + ((k = 4) * (k + 2))
		// k = 1 + (   4    *     6  )
		// k = 25
		k += (k = 4) * (k + 2);
	
		//a[0] =  a[0]+ ((a[0] = 4) * (a[0] + 2));
		//a[0] =  1 + (( 4 * (4 + 2));
		a[0] += (a[0] = 4) * (a[0] + 2);
		
		System.out.println(k + " , " + a[0]);
	}
}