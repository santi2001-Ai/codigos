import java.util.Scanner;  // Importamos Scanner para leer la entrada del usuario

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Creamos un objeto Scanner

        // Pedir el primer valor
        System.out.print("Ingrese el primer valor: ");
        int A = scanner.nextInt();  // Captura el primer número

        // Pedir el segundo valor
        System.out.print("Ingrese el segundo valor: ");
        int C = scanner.nextInt();  // Captura el exponente

        // Calcular la potencia
        double valor = Math.pow(A, C);  // Utilizamos Math.pow(base, exponente)

        // Imprimir el resultado
        System.out.println("La potencia de " + A + " sobre " + C + " es: " + valor);

        scanner.close();  // Cerramos el Scanner para liberar recursos
    }
}
 