import java.util.ArrayList;
import java.util.Arrays;

public class ListasJava {
    public static void main(String[] args) {
        // Definir una lista de Strings
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"));

        // Imprimir el elemento en la posición 4 (índice basado en 0)
        System.out.println(lista.get(4)); // "Viernes"

        // Imprimir toda la lista
        System.out.println(lista);

        // Imprimir los primeros 3 elementos
        System.out.println(lista.subList(0, 3));

        // Lista mixta con diferentes tipos de datos
        ArrayList<Object> listaMixta = new ArrayList<>(Arrays.asList(
            "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado",
            1, 2, 3, Arrays.asList("Santiago", 0.2, 2.25, true)
        ));

        // Imprimir parte de la lista y una sublista dentro de ella
        System.out.println(listaMixta.subList(0, 4) + " " + ((ArrayList<?>) listaMixta.get(9)).subList(0, 3));
    }
}
