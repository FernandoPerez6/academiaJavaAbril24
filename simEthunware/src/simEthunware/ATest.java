package simEthunware;

public class ATest {

	
	//VARIABLES INSTANCIA
	//VARIABLES DE CLASE
	//AMBAS SE INICIALIZAN DE FORMA AUTOMATICAS
    String global = "111";

    public int parse(String arg) {
    	//VARIABLE LOCAL
    	//INICIALIZAR
        int value = 0;
        try {
            String global = arg;
            value = Integer.parseInt(global);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        System.out.print(global + " " + value + " ");
        return value;
    }

    public static void main(String[] args) {
        ATest ct = new ATest();
        System.out.print(ct.parse("333"));
    }
}
