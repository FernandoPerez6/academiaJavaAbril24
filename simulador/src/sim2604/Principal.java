package sim2604;

class A{ 
	void show() {
		System.out.println("Hello");
	}
}

abstract class B extends A{ }

class C extends B{
	
}



public class Principal {

	public static void main(String[] args) {
		B b = new C();
		b.show();
	}
	
	
}
