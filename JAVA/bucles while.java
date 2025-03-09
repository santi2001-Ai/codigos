import java.util.Scanner;  // Importamos Scanner para leer la entrada del usuario

public class Main {
    public static void main(String[] args) {
        // 1️⃣ Primer bucle: Contador de 1 a 30
        int contador = 0;  // Declaramos e inicializamos la variable contador

        while (contador < 30) {  // Mientras el contador sea menor que 30
            contador++;  // Incrementamos el contador
            System.out.println("Iteración " + contador);  // Imprimimos el valor actual
        }

        // 2️⃣ Segundo bucle: Solicitar un número mayor a 10
        Scanner scanner = new Scanner(System.in);  // Creamos un objeto Scanner para leer la entrada del usuario
        
        while (true) {  // Bucle infinito hasta que se ingrese un número correcto
            System.out.println("Introduzca un valor mayor a 10: ");
            int a = scanner.nextInt();  // Leemos la entrada del usuario como entero
            
            if (a > 10) {  // Si el número ingresado es mayor que 10
                System.out.println("Es correcto");
                break;  // Salimos del bucle
            } else {  // Si el número es menor o igual a 10
                System.out.println("Es incorrecto, pruebe de nuevo");
            }
        }
        
        scanner.close();  // Cerramos el Scanner para liberar recursos
    }
}
