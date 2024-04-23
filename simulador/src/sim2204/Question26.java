package sim2204;


class Animal {}

class Aguila extends Animal {}

class AguilaCalva extends Aguila{}

public class Question26 {
	
	public static void main(String[] args) {
		getAnimal(new Aguila());
	}

	private static void getAnimal(Animal animal) {
		System.out.println("Paso!!!");
	}
}
