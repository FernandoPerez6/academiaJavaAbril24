package sim2304;

public interface Ave {
	
	//public static final
	int x=0;
	String cadena = "hola";
	
	//public abstract 
	void volar();
	
	//V8
	static void ejecutaStatic() {
		System.out.println("static Interface");
	}
	
	default void ejecutaDefault() {
		System.out.println("default Interface");
	}
	
	//9
	//private con comportamiento
	//static private con compartimiento

}

class Aguila implements Ave {
	
	public void volar(){ }
	
}
