package sim0514;

public class Principal {
	private static final StringBuilder b1 = new StringBuilder("yoodler");
	private static final StringBuilder b2 = new StringBuilder("snorkler");

	public static StringBuilder getCopyOfB1() {
		return new StringBuilder(b1.toString());
	}

	public static StringBuilder getCopyOfB2() {
		return new StringBuilder(b2.toString());
	}

	public static void main(String[] args) {
		StringBuilder copyOfB1 = getCopyOfB1();
		StringBuilder copyOfB2 = getCopyOfB2();

		copyOfB1.append("123");
		System.out.println("Original b1: " + b1); // No se modifica

		copyOfB2.append("123");
		System.out.println("Original b2: " + b2); // No se modifica

	}

	void op1() {
		b1.append(b2.substring(2, 5).toUpperCase());
	}

	void op2() {
		b2.insert(3, b1.append("a"));
	}

	void op3() {
		b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
	}
}