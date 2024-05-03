package sim0503;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Principal2 {

	public static void main(String[] args) {
		//Identify the valid for loop constructs 
		//assuming the following declarations:
		Object o = null;
		Collection c = null; //valid collection object.
		
		int[][] ia = {{1,2},{3,4,5},{6,7}}; //valid array
		for (int[] arreglo : ia) {
			System.out.println(Arrays.toString(arreglo));
			for (int x :arreglo)
				System.out.println(x);
		}
		
		int[] ib = null; //valid array
		//forEach
		//for ( int i  : ib) {}
			
	}

}
