package sim0510;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		String str = "abc def ghi";
		String[] arrayString1 = str.split(" ");
		//System.out.println(Arrays.toString(arrayString1));
		
		String[] arrayString2 = {"abc","def","ghi"};
		//System.out.println(Arrays.toString(arrayString2));
		
		System.out.println(arrayString1.equals(arrayString2)); 
		
		System.out.println(Arrays.equals(arrayString1, arrayString2));
		
		System.out.println("***********");
		
		int[] arrayInt1 = {4,5,6};
		int[] arrayInt2 = {4,5,6};
		
		System.out.println(arrayInt1.equals(arrayInt2)); 
		System.out.println(Arrays.equals(arrayInt1, arrayInt2));

		
	}

}
