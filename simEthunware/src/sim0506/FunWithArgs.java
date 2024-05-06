package sim0506;

public class FunWithArgs {
	
	//método static normal
//    public static void main(String[][] args) {
//        System.out.println(args[0][1]);
//    }
    public static void main(String[]... args) {
        System.out.println(args[0][1]);
    }
    
    public static void main(int[] args) {
        System.out.println(args[0]);
    }
    
    public static void main(StringBuilder args) {
        System.out.println(args);
    }

    final public static void main(String[] args) throws Exception {
        FunWithArgs fwa = new FunWithArgs();
//        String[][] newargs = {{"1","2"},{"3","4","5"},{}};
//        newargs = new String[][]{{},{}};
//        newargs = new String[][]{{"a","b","c"}};
        String[][] newargs = {args};
        fwa.main(newargs);
        //main(newargs);
    }
}
