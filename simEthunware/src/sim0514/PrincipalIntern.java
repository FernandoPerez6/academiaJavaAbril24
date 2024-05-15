package sim0514;

public class PrincipalIntern {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = new String("Hello").intern();
		
		//System.out.println(s1==s2); // true
		
		String s3 = "He";
		String s4 = s1.substring(0,2).intern(); //He
		
		StringBuilder sb = new StringBuilder("He");
		String s5 = sb.toString().intern();
		
		System.out.println(s3==s5); 
		
		
		//System.out.println(s4);
		
		System.out.println("******");
		
		String s6 = "Hola";
		String s7 = "hOLA";
		String la = "la";
		
		//System.out.println(s6.equalsIgnoreCase(s7));
		
		System.out.println(s6 == ("Ho"+"la")); //true
		System.out.println(s6 == ("Ho"+la)); //false
		System.out.println(s6 == ("Ho"+la).intern()); //true
		
		
	}

}
