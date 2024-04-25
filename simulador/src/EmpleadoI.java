import java.io.Serializable;

public interface EmpleadoI extends Serializable {
	
	//public static final
	String tipo = "x";
	
	//public abstract
	void cobrar();
	
	//8
	static void asignar() {
		System.out.println("static method");
	}
	
	//8
	default void comision() {
		System.out.println("default method");
	}
	
	//9 
//	private static void asignar2() {
//		System.out.println("private static method");
//	}
//	private void asignar3() {
//		System.out.println("private method");
//	}

}
