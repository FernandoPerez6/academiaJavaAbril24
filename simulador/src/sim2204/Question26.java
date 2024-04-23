package sim2204;


class Animal {}

class Aguila extends Animal {}

class AguilaCalva extends Aguila{}

public class Question26 {
	
	public static void main(String[] args) {
		
		//UPCASTING (CAST IMPLICITO)
		AguilaCalva ac = new AguilaCalva();
		Aguila a = ac;
		
		//DOWNCASTING (CAST EXPLICITO)
		Animal animal = new AguilaCalva();
		Aguila aguila = (Aguila) animal;
		
		getAnimal("Hola");
	}

	private static void getAnimal(Object animal) {
		System.out.println("Paso!!!");
	}
}
