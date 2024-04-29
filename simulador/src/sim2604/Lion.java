package sim2604;

public class Lion {
    public void roar(String roar1, StringBuilder roar2){
        roar1 = roar1.concat("!!!"); //NUEVO OBJETO //LIMBO
        roar2.append("!!!"); //roar!!! //MODIFICA AL OBJETO ACTUAL
    }

    public static void main(String[] args) {
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
                    //String Inmutable roar1
                    //StringBuilder Mutable roar2
        new Lion().roar(roar1,roar2);
                          //roar        //roar!!!     
        System.out.println(roar1 + " " + roar2);
    }
}