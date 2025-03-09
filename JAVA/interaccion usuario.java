import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos al usuario
        System.out.print("Escriba sus nombres completos: ");
        String nombres = scanner.nextLine();

        System.out.print("Escriba sus Apellidos completos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Escriba su profesión: ");
        String profesion = scanner.nextLine();

        System.out.print("Escriba su año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();

        // Calcular la edad
        int edad = 2025 - añoNacimiento;

        // Mostrar el resultado
        System.out.println("El (La) " + profesion + " " + nombres + " " + apellidos + " tiene " + edad + " años.");

        scanner.close(); // Cerrar el scanner
    }
}
