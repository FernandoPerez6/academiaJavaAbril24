package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		Component c1 = new LeafConstante(4.0);
		Component c2 = new LeafConstante(6.0);
		Component c3 = new LeafConstante(200.0);
		Component c4 = new LeafConstante(3.0);
		Component c5 = new LeafConstante(83.0);
		
		Component c6 = new CompositeSuma(c1,c2);
		Component c7 = new CompositeMulti(c6,c3);
		Component c8 = new CompositeSuma(c4,c5);
		Component c9 = new CompositeDiv(c7,c8);
		
		System.out.println(c9.getValor());
		
		
		System.out.println("***************");
		
		System.out.println(
				new CompositeDiv(
					new CompositeMulti(
							new CompositeSuma(
									new LeafConstante(4.0)	
									,	
									new LeafConstante(6.0)			
								)	
							,
							new LeafConstante(200.0)			
					)	
				,	
					new CompositeSuma(
						new LeafConstante(3.0)				
						,	
						new LeafConstante(83.0)						
					)	
				).getValor()
		);



		
		
	}

}
