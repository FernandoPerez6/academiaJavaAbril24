package primitivos;

public class Principal2 {

	public static void main(String[] args) {
		
		for (int x=0;x<5;x++) {
			System.out.println("x:"+x);
		}

		System.out.println("********");
		int x = 0;
		for (;;) {
			if (x>=5)
				break;
			System.out.println("x:"+x);
			x++;
		}
				
		//System.out.println("Fin de Programa");
		
	}

}
