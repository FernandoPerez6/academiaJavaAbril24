package sim0507.v0;

class TestClass2 extends T1 implements T2 {
	
	public static void main(String[] args) {
		T2 t = new TestClass2();
		t.m1();
	}
	
	public void m1() {
		System.out.println("m2()");
	}
}

abstract class  T1 {
	
	int VALUE = 1;

	abstract void m1();
}

interface  T2 {
	int VALUE = 2;

	void m1();
}
