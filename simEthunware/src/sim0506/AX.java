package sim0506;

public class AX {
	static int[] x = new int[0];

	static {
		try {
			x[0] = 10;
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.getMessage();
			System.out.println("ArrayIndexOutOfBoundsException");
			//e.printStackTrace();	
		}catch(ExceptionInInitializerError e) {
			System.out.println("ExceptionInInitializerError");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		AX ax = new AX();
		System.out.println("Fin de Programa");
	}

}
