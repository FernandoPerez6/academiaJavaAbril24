package sim0502;

public class Principal {

	public static void main(String[] args) {
		
		for (int x=100; x<0; x++) {
			System.out.println("Hola Mundo");
		}
		
		boolean b = false;

		for (int x=100; b; x++) {
			System.out.println("Hola Mundo");
		}
		
		while(b) {
			System.out.println("While");
		}
		
//		for (int x=100; false; x++) {
//			System.out.println("Hola Mundo");
//		}
		
//		while(false) {
//			System.out.println("While");
//		}
		
		if(false) {
			System.out.println("***");
		}
		
		do {
			System.out.println("Paso DO WHILE");
		}while(false);
		
		System.out.println("Fin de Programa");
	}

}
