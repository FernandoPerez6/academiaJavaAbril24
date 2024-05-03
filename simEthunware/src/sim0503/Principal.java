package sim0503;

import java.util.ArrayList;
import java.util.Collection;

public class Principal {

	public static void main(String[] args) {
		//Identify the valid for loop constructs 
		//assuming the following declarations:
		Object o = null;
		Collection c = new ArrayList(); //valid collection object.
		int[][] ia = null; //valid array
		
		c.add(new Object());
		c.add(new Object());
		c.add(new Object());

		//forEach
		for (final Object o2: c) {
			System.out.println(o2);
		}
			
	}

}
