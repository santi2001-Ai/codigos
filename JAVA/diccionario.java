import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    public static void main(String[] args) {
        // Crear un diccionario (HashMap en Java)
        Map<String, String> coche = new HashMap<>();
        
        // Agregar valores al diccionario
        coche.put("marca", "Chana");
        coche.put("color", "blanco");
        coche.put("modelo", "sedan");
        coche.put("placa", "DAD190");

        // Imprimir el color
        System.out.println(coche.get("color"));

        // Cambiar el valor de color
        coche.put("color", "Negro");
        System.out.println(coche.get("color"));

        // Imprimir la marca
        System.out.println(coche.get("marca"));

        // Cambiar el valor de marca
        coche.put("marca", "Renault");
        System.out.println(coche.get("marca"));

        // Imprimir todo el diccionario
        System.out.println(coche);
    }
}
