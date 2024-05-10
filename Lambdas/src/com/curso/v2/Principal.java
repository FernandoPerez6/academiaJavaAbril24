package com.curso.v2;

class Suma implements Operacion {
	public int ejecuta(int x, int y) {
		return x + y;
	}
}

class Resta implements Operacion {
	public int ejecuta(int x, int y) {
		return x - y;
	}
}

class Multi implements Operacion {
	public int ejecuta(int x, int y) {
		return x * y;
	}
}

class Division implements Operacion {
	public int ejecuta(int x, int y) {
		return x / y;
	}
}

class Potencia implements Operacion {
	public int ejecuta(int x, int y) {
		return (int)(Math.pow(x, y));
	}
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V2 Lambda");
		
		Operacion opeDiv = new Division();
		Operacion opeSuma = new Suma();
		Operacion opeResta = new Resta();
		Operacion opeMulti = new Multi();
		Operacion opePotencia = new Potencia();
		
		Operacion[] arregloOpe = new Operacion[] {
				opeDiv,
				opeSuma,
				opeResta,
				opeMulti,
				opePotencia
		};
		
		for(int x=0;x < arregloOpe.length;x++) {
			show(arregloOpe[x]);
		}	
	}
		
	static void show(Operacion ope) {
		System.out.println(ope.getClass().getSimpleName());
		System.out.println(ope.ejecuta(8,4));
	}

}
