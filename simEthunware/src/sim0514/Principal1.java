package sim0514;

public class Principal1 {
	
	public static void main(String[] args) {
		StringBuilder b1 = new StringBuilder("yoodler");
		StringBuilder b2 = new StringBuilder("snorkler");
		//                                    01234
		
		//b1.replace(3, 4, b2.substring(4).append(b2.append(false)));
		
		
		StringBuilder sb1 = new StringBuilder("hola");
		String s1 = sb1.substring(2);
		//System.out.println(sb1.substring(2).concat(" mundo"));
		
		//CORRECTO
		//b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
		//          d    kler             snorklerfalse
		// yoo kler ler snorklerfalse
		//System.out.println(b1);
		
		//System.out.println(b1.replace(3, 4, b2.substring(4)));
		//         d
		//b1 = yoo kler ler
		//     012 3 
		
		
		//System.out.println(b1.replace(3, 5, b2.substring(4,5)));
		//         dl
		//b1 = yoo k er
		//     012 3 
		
		//System.out.println(b1.replace(3, 5, b2.toString()));
		//         dl
		//b1 = yoo snorkler er
		//     012 3 
		
		b2.append(b1);
		System.out.println(b2);
		

	}

}