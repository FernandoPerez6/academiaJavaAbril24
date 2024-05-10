package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3 Lambda");
		
		Operacion opeSuma = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Suma");
				return x+y;
			}
		};
		
		Operacion opeDiv = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Division");
				return x/y;
			}
		};
		Operacion opeResta = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Resta");
				return x-y;
			}
		};
		Operacion opeMulti = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Multi");
				return x*y;
			}
		};;
		Operacion opePotencia = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Potencia");
				return (int)(Math.pow(x, y));
			}
		};
		
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
		System.out.println(ope.ejecuta(8,4));
	}

}
