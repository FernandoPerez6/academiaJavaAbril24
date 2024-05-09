package sim0509.px;

import sim0509.p1.Movable;
import sim0509.p2.Donkey;

public class TestClass {
	public static void main(String[] args) {
		Movable m = new Donkey();
		m.move(10);
		m.moveBack(20);
		System.out.println(m.location); //0
		System.out.println(Movable.location); //0
		System.out.println(((Donkey)m).location); //190
		System.out.println("************");
		Donkey m1 = new Donkey();
		m1.move(10);
		m1.moveBack(20);
		System.out.println(m1.location); //190
		System.out.println(((Movable)m1).location); //0
		
		//Movable.location = 1;
		
	}
}
