package sim2304;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int suma = 0;
        for (int i = 1; i <= numeros.length; i++){
            suma += numeros[i]; 
        }

        System.out.println("La suma de los números es: " + suma);
    }
}