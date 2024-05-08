package sim0508;

//Consider the following code:
class A {
	A() {
		super();
		print();
	}

	void print() {
		System.out.print("A ");
	}
}

class B extends A {
	int i = 4;

	public static void main(String[] args) {
		A a = new B();
		a.print(); //4 
	}

	void print() {
		System.out.print(i + " "); //<==0 
	}
}
//What will be the output when class B is run ?