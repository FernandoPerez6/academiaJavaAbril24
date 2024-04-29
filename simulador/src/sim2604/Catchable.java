package sim2604;

public abstract class Catchable {
	
    protected abstract void catchAnObject(Object x);

    public static void main(String[] args) {
        java.util.Date now = new java.util.Date();
        Catchable target = new MyStringCatcher();
        target.catchAnObject("Hello");
    }
}

class MyStringCatcher extends Catchable{
    public void catchAnObject(Object x){
        System.out.println("Caught object");
    }

    public void catchAnObject(String x){
        System.out.println("Catch String");
    }
}