
class EmpleadoNomina implements EmpleadoI{

	@Override
	public void cobrar() {
		System.out.println("cobrar");
	}
	
}


public class Principal {

	public static void main(String[] args) {

		EmpleadoI.asignar(); //static Interface
		
		EmpleadoI e = new EmpleadoNomina();
		
		e.comision(); //default Interface
		
	}

}
