package sim0509.p2;

import sim0509.p1.Movable;

public class Donkey implements Movable {
	public int location = 200; //210 //190

	public void move(int by) {
		location = location + by;
	}

	public void moveBack(int by) {
		location = location - by;
	}
}
