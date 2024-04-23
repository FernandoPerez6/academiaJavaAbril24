package sim2204;

public class Palabra {
    public static void main(String[] args) {
        String sPalabra = "anitalavalatina";
        int inc = 0;
        int des = sPalabra.length() - 1;
        boolean bError = false;
        while ((inc < des) && (!bError)){
            if (sPalabra.charAt(inc) == sPalabra.charAt(des)){
                inc++;
                des--;
            } else {
                bError = true;
            }
        }
        System.out.println(bError); //true
    }

}