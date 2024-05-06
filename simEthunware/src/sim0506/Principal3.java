package sim0506;

public class Principal3 {
	
	void ejecuta(int x) {
		System.out.println("int");
	}
	
	void ejecuta(Integer x) {
		System.out.println("Integer");
	}
	
	void ejecuta(Long x) {
		System.out.println("Long");
	}
	
	void ejecuta(Object x) {
		System.out.println("Object");
	}
	
	void ejecuta(int... x) {
		System.out.println("int...");
	}
	
	void ejecuta(Integer... x) {
		System.out.println("Integer...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
