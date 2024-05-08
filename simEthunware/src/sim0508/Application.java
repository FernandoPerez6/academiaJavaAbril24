package sim0508;

class CorbaComponent {
	String ior; //URL://IOR

	//CONSTRUCTOR PADRE
	CorbaComponent() {
		super();
		startUp("IOR");
		System.out.println("Mas pasos CorbaComponent");
	}

	void startUp(String s) {
		ior = s;
	}

	void print() {
		System.out.println(ior);
	}
}

class OrderManager extends CorbaComponent {
	
	OrderManager(){
		super();
		System.out.println("Mas pasos OrderManager");
	}

	@Override
	void startUp(String s) { //<=EJECUTA
		ior = getIORFromURL(s); //ior = "URL://IOR
	}

	String getIORFromURL(String s) {
		return "URL://" + s;
	}
}

public class Application {
	public static void main(String args[]) {
//		CorbaComponent cc = new OrderManager();
//		start(cc);
		start(new OrderManager());
	}

	static void start(CorbaComponent cc) {
		cc.print(); //URL://IOR
	}
}
