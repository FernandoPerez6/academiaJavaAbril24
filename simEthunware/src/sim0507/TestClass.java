package sim0507;


//Filename: TestClass.java
class TestClass implements T1, T2 {
	
	public static void main(String[] args) {
		TestClass t = new TestClass();
		t.m1();
		System.out.println(((T1)t).VALUE);
	}
	
	public void m1() {
		System.out.println("m1()");
	}
}

interface T1 {
	//static final public
	int VALUE = 1;

	void m1();
}

interface T2 {
	//static final public
	int VALUE = 2;

	void m1();
}
