import java.util.ArrayList;

public class Principal {
	
	static String mensaje = "Hola";

	public static void main(String[] args) {
		var r = ejecutar(mensaje);
		
		System.out.println(((Object)r).getClass().getName());
		
		
	}

	private static int ejecutar(String cadena) {

		var lista = new ArrayList<String>();
		
		System.out.println(lista.getClass().getName());
		
		lista.add(cadena);
				
		var res = lista.size();
		
		System.out.println("Tamaño: "+res);
		
		return res;
		
	}

}
