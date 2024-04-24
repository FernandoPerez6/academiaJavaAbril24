package sim2304;

class ClassX{
    static int y = 2;

	ClassX(int x) {
		this();
		y = y * 2; //6
	}

    ClassX(){
        y++; //3
    }
}

public class Class2 extends ClassX{
    Class2(){
        super(y);
        y = y + 3; //9
    }
    public static void main(String[] args) {
    	new Class2();
        System.out.println(y); //9
    }
}