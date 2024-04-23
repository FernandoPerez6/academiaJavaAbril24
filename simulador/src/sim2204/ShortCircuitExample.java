package sim2204;

public class ShortCircuitExample {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 10;

        // Uso de short-circuit AND. Si la primera condición es falsa, la segunda no se evalúa.
        if (num1 != 0 && (num2 / num1) > 1) {
            System.out.println("El resultado es mayor que 1");
        } else {
            System.out.println("Short-circuit activado: la primera condición es falsa, la segunda no se evalúa.");
        }

        // Uso de short-circuit OR. Si la primera condición es verdadera, la segunda no se evalúa.
        if (num1 == 0 || (num2 / num1) > 1) {
            System.out.println("Short-circuit activado: la primera condición es verdadera, la segunda no se evalúa.");
        } else {
            System.out.println("El resultado no es mayor que 1");
        }
    }
}
