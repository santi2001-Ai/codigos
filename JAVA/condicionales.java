import java.util.Scanner;  // Importamos Scanner para leer la entrada del usuario

public class CalcularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.1416; // Definir una constante
        final int CONST = 2; // Definir una constante entera

        // Pedir la figura
        System.out.println("Seleccione la figura a calcular su área: \n" +
                "1 para Rombo\n" +
                "2 para Rectángulo\n" +
                "3 para Cuadrado\n" +
                "4 para Trapecio\n");

        int figura = scanner.nextInt(); // Capturamos la opción

        switch (figura) {
            case 1: // Rombo
                System.out.print("Ingrese el valor de la diagonal mayor: ");
                int Dmayor = scanner.nextInt();
                System.out.print("Ingrese el valor de la diagonal menor: ");
                int Dmenor = scanner.nextInt();
                double areaRombo = (Dmayor * Dmenor) / (double) CONST;
                System.out.println("El área del rombo es: " + areaRombo);
                break;

            case 2: // Rectángulo
                System.out.print("Ingrese el valor del largo del rectángulo: ");
                int largo = scanner.nextInt();
                System.out.print("Ingrese el valor del ancho del rectángulo: ");
                int ancho = scanner.nextInt();
                int areaRectangulo = largo * ancho;
                System.out.println("El área del rectángulo es: " + areaRectangulo);
                break;

            case 3: // Cuadrado
                System.out.print("Ingrese el valor del lado del cuadrado: ");
                int lado = scanner.nextInt();
                int areaCuadrado = lado * lado;
                System.out.println("El área del cuadrado es: " + areaCuadrado);
                break;

            case 4: // Trapecio
                System.out.print("Ingrese el valor de la base mayor: ");
                int Bmayor = scanner.nextInt();
                System.out.print("Ingrese el valor de la base menor: ");
                int Bmenor = scanner.nextInt();
                System.out.print("Ingrese la altura del trapecio: ");
                int altura = scanner.nextInt();
                double areaTrapecio = ((Bmayor + Bmenor) * altura) / 2.0;
                System.out.println("El área del trapecio es: " + areaTrapecio);
                break;

            default:
                System.out.println("Opción inválida. Intente nuevamente.");
        }

        scanner.close(); // Cerrar el Scanner
    }
}
