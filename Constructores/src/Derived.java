
class Base {
    static {
        System.out.println("Base static block ");
    }

    public Base() {
        System.out.println("Base constructor ");
    }
}

public class Derived extends Base {
    static {
        System.out.println("Derived static block ");
    }

    public Derived() {
    	super();
        System.out.println("Derived constructor ");
    }

    public static void main(String[] args) {
        System.out.println("main end");

        Derived d = new Derived();
        
        //Base static block
        //Derived static block
        //main end
        //Base constructor 
        //Derived constructor 
    }
}
