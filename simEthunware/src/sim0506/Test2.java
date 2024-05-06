package sim0506;

class Test2 {
	public static void main(String[] args) {
		int k = 1;
		// k = k + ((k = 4) * (k + 2))
		// k = 1 + (   4    *     6  )
		// k = 25
		
		if (2<3)
			k = 2;
		
		// k = 2 + (4 * 6)
		k += (k = 4) * (k + 2);
	
		
		System.out.println(k );
	}
}