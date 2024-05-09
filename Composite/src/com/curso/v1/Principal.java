package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Component c1 = new LeafConstante(3.0);
		Component c2 = new LeafConstante(9.0);
		Component c3 = new LeafConstante(4.0);
		
		Component c4 = new CompositeSuma(c1,c3);
		
		Component c5 = new CompositeSuma(c2,c4);
		
		System.out.println(c5.getValor());
		
		System.out.println("***************");
		
		System.out.println(
				new CompositeSuma(
					new CompositeSuma(
							new LeafConstante(1.0)		
						,	
							new CompositeSuma(
								new LeafConstante(2.0)	
								,	
								new LeafConstante(3.0)			
							)					
					)	
				,	
					new CompositeSuma(
							new CompositeSuma(
									new LeafConstante(4.0)	
									,	
									new LeafConstante(7.0)			
							)			
						,	
							new CompositeSuma(
								new LeafConstante(5.0)	
								,	
								new LeafConstante(6.0)			
							)					
					)	
				).getValor()
		);



		
		
	}

}
