package sim0508.v0;

//Consider the following code:
class A {
	int i = 4;
	
	A() {
		super();
		print();
	}

	Number print() {
		System.out.print("A ");
		return 1;
	}
}

class B extends A {
	

	public static void main(String[] args) {
		A a = new B();
		a.print(); //4 
		//System.out.println(a.i); 
	}

	@Override
	Long print() {
		System.out.print(i + " ");
		return 2l;
	}
}
//What will be the output when class B is run ?