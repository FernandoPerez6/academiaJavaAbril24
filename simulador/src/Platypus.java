class Mammal{
    public Mammal(int age){
        System.out.println("Mammal");
    }
    public Mammal() {}
}
public class Platypus extends Mammal{
    public Platypus(){
    	//super(10);
        System.out.println("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}
