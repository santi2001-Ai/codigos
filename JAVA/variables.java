public class OperacionesMatematicas {
    public static void main(String[] args) {
        // Declaración de variables
        int a = 10;
        int b = 4;

        // Multiplicación
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: * ");
        System.out.println("La segunda variable es: " + b);
        int c = a * b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de dato: " + ((Object)c).getClass().getSimpleName());

        // División
        System.out.println("\nLa primera variable es: " + a);
        System.out.println("El signo de la operación es: / ");
        System.out.println("La segunda variable es: " + b);
        double d = (double) a / b; // Conversión a double para obtener un resultado decimal
        System.out.println("El resultado es: " + d);
        System.out.println("Tipo de dato: " + ((Object)d).getClass().getSimpleName());

        // Suma
        System.out.println("\nLa primera variable es: " + a);
        System.out.println("El signo de la operación es: + ");
        System.out.println("La segunda variable es: " + b);
        c = a + b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de dato: " + ((Object)c).getClass().getSimpleName());

        // Resta
        System.out.println("\nLa primera variable es: " + a);
        System.out.println("El signo de la operación es: - ");
        System.out.println("La segunda variable es: " + b);
        c = a - b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de dato: " + ((Object)c).getClass().getSimpleName());

        // Potencia
        System.out.println("\nLa primera variable es: " + a);
        System.out.println("El signo de la operación es: ** ");
        System.out.println("La segunda variable es: " + b);
        double potencia = Math.pow(a, b); // Uso de Math.pow para calcular potencias
        System.out.println("El resultado es: " + potencia);
        System.out.println("Tipo de dato: " + ((Object)potencia).getClass().getSimpleName());

        // Módulo
        System.out.println("\nLa primera variable es: " + a);
        System.out.println("El signo de la operación es: % ");
        System.out.println("La segunda variable es: " + b);
        c = a % b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de dato: " + ((Object)c).getClass().getSimpleName());
    }
}
