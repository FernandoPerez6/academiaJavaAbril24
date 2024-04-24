package com.demo.v0;

import java.util.Random;

class Vibora implements Animal{
	@Override
	public void makeSound() {
		System.out.println("ssss ssss");
	}
}

class Gato implements Animal{
	@Override
	public void makeSound() {
		System.out.println("miau miau");
	}
}

class Perro implements Animal{
	@Override
	public void makeSound() {
		System.out.println("guau guau");
	}
}

class Pato implements Animal{
	@Override
	public void makeSound() {
		System.out.println("kuak kuak");
	}
}


public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Interface v0");

		Pato pato = new Pato();
		pato.makeSound();
		//pato = new Gato();
		
		System.out.println("*******");
		
		Animal animal = new Perro();
		animal.makeSound();
				
		animal = new Gato();
		animal.makeSound();

		System.out.println("*******");
		
		animal = getAnimal();
		animal.makeSound(); 
		
	}

	private static Animal getAnimal() {
		Animal[] arrayAnimal = 
			{new Gato(),new Vibora(),new Perro(),new Pato()};
		int x = new Random().nextInt(arrayAnimal.length);
		System.out.println(arrayAnimal[x].getClass().getSimpleName());
		return arrayAnimal[x];
	}

}
