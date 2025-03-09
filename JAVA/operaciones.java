import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese valor: ");
        int A = scanner.nextInt();

        System.out.print("Ingrese valor: ");
        int B = scanner.nextInt();

        // Operaciones matemáticas
        int suma = A + B;
        System.out.println("La suma de los números es: " + suma);

        int res = A - B;
        System.out.println("La resta de los números es: " + res);

        int multi = A * B;
        System.out.println("La multiplicación de los números es: " + multi);

        // Manejo de la división para evitar divisiones por cero
        if (B != 0) {
            double div = (double) A / B;
            System.out.println("La división de los números es: " + div);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // Comparaciones
        boolean igual = (A == B);
        System.out.println("¿Los números son iguales?: " + igual);

        boolean mayor = (A > B);
        System.out.println("El número menor es: " + (mayor ? B : A));
        System.out.println("El número mayor es: " + (mayor ? A : B));

        scanner.close();
    }
}
