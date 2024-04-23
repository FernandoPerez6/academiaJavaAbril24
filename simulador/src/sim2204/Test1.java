package sim2204;

public class Test1 extends Concreate{
    Test1(){
    	super();
        System.out.println("t ");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Test1();
    }
}
class Concreate extends Send{
    Concreate(){
        System.out.println("c ");
    }
    private Concreate(String s){
    	System.out.println("x ");
    }
}
abstract class Send{
    Send(){
        System.out.println("s ");
    }
}

//sxt