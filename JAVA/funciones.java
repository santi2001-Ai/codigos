import java.util.ArrayList;
import java.util.List;

public class Funciones {
    public static void main(String[] args) {
        // Definir las listas (tuplas en Python equivalen a arrays o listas en Java)
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        List<Integer> c = new ArrayList<>();

        // Multiplicar elementos y agregar a la lista C
        for (int i = 0; i < a.length; i++) {
            c.add(a[i] * b[i]);
        }

        // Imprimir el resultado
        System.out.println(c);

        // Llamadas a funciones
        mostrarTexto();
        multiplicar();
        
        // Ejemplo de variables globales
        int resultado = multiplicarConRetorno();
        System.out.println(resultado + 5);

        // Validación de dato
        int datoA = 5;
        boolean esValido = validarDato(datoA);
        System.out.println(esValido);
    }

    // Función sin parámetros ni retorno
    public static void mostrarTexto() {
        System.out.println("Hola");
    }

    // Función sin parámetros ni retorno que realiza una multiplicación
    public static void multiplicar() {
        int a = 5;
        int b = 8;
        System.out.println(a * b);
    }

    // Función que devuelve un resultado
    public static int multiplicarConRetorno() {
        int a = 5;
        int b = 8;
        return a * b;
    }

    // Función que valida un dato y devuelve un booleano
    public static boolean validarDato(int a) {
        return a == 5;
    }
}
