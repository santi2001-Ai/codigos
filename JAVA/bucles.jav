import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Lista de nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Santiago");
        nombres.add("Hans");
        nombres.add("Jhon");
        nombres.add("Juan Pablo\n\n"); // Simulando el salto de línea

        // Iteramos sobre la lista de nombres e imprimimos cada uno
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Lista de personas usando ArrayList de HashMap
        ArrayList<HashMap<String, Object>> Personas = new ArrayList<>();

        // Creamos diccionarios con datos de personas
        HashMap<String, Object> a = new HashMap<>();
        a.put("nombre", "Santiago");
        a.put("Edad", 23);

        HashMap<String, Object> b = new HashMap<>();
        b.put("nombre", "Hans");
        b.put("Edad", 27);

        HashMap<String, Object> c = new HashMap<>();
        c.put("nombre", "Jhon");
        c.put("Edad", 41);

        HashMap<String, Object> d = new HashMap<>();
        d.put("nombre", "Juan Pablo");
        d.put("Edad", 23);

        // Agregamos los diccionarios a la lista Personas
        Personas.add(a);
        Personas.add(b);
        Personas.add(c);
        Personas.add(d);

        // Iteramos sobre la lista de personas e imprimimos sus valores
        for (HashMap<String, Object> persona : Personas) {
            System.out.println(persona.get("nombre") + " " + persona.get("Edad"));
        }
    }
}
