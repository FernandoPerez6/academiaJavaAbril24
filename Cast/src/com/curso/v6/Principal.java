package com.curso.v6;

public class Principal {

	public static void main(String[] args) {
	
		AguilaReal ar = new AguilaReal();
		
		System.out.println(ar.tipo); //AGUILA REAL
		ar.volar();
		ar.volarAguilaReal();
		ar.volarAguila();
		ar.volarAve();
		System.out.println(ar.toString());
		
		Aguila a = ar;
		
		System.out.println(a.tipo); //AGUILA
		a.volar(); //VOLAR COMO AGUILA REAL
		//a.volarAguilaReal(); <=NO PUEDE
		a.volarAguila();
		a.volarAve();
		System.out.println(a.toString());
		
		Ave av = a;
		
		System.out.println(av.tipo); //AVE
		av.volar(); //VOLAR COMO AGUILA REAL
		//av.volarAguilaReal(); <=NO PUEDE
		//av.volarAguila(); <=NO PUEDE
		av.volarAve();
		System.out.println(a.toString());
		
		Object obj = av;
		
		//System.out.println(obj.tipo); <=NO SE PUEDE
		//obj.volar(); <=NO SE PUEDE
		//obj.volarAguilaReal(); <=NO PUEDE
		//obj.volarAguila(); <=NO PUEDE
		//obj.volarAve(); <=NO PUEDE
		System.out.println(obj.toString());
		
		System.out.println("************************");
		
		
		Object obj1 = new AguilaReal();
		
		System.out.println(((AguilaReal)obj1).tipo); 
		((AguilaReal)obj1).volar(); 
		((AguilaReal)obj1).volarAguilaReal(); 
		((AguilaReal)obj1).volarAguila(); 
		((AguilaReal)obj1).volarAve();
		System.out.println(obj1.toString());
		
		

		
	}

}
