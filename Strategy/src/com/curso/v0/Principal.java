package com.curso.v0;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		List<Ave> listaAves = new ArrayList<>();
		listaAves.add(new Pato("Lucas")); //Si quiero vuelo
		listaAves.add(new Pato("Donald")); //No vuele
		listaAves.add(new Pato("Patito Feo")); //Si vuele

		listaAves.add(new Aguila("America"));
		listaAves.add(new Pinguino("Chilly Willy"));

		show(listaAves);

	}

	private static void show(List<Ave> listaAves) {
		for (Ave a : listaAves) {
			System.out.println(a);
			a.volar();
		}
	}

}
