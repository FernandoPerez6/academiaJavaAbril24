package sim0520;

public class TestClass {
    public static void main(String[] args) throws Exception {
        int a = Integer.MIN_VALUE;
        System.out.println(a);
        int b = -a; // -(Integer.MAX_VALUE + 1);
        System.out.println(a + " " + b);
        System.out.println("*************");
        
        int c = 10;
        int d = -c;
        
        System.out.println(c + " " + d);
    }
}

