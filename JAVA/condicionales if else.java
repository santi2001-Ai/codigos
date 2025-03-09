public class Condiciones {
    public static void main(String[] args) {
        int a = 2;
        
        // Condición simple
        if (a == 2) {
            System.out.println("a vale 2");
        } else {
            System.out.println("a es diferente de 2");
        }

        // Declaración de variables
        String nombre = "Santiago";
        int edad = 23;
        String pais = "Colombia";

        // Evaluación de múltiples condiciones
        if (nombre.equals("Santiago") && edad == 23 && pais.equals("Colombia")) {
            System.out.println("Su nombre es " + nombre + ", tiene " + edad + " y es de " + pais);
        } else if (nombre.equals("Santiago") && edad != 23) {
            System.out.println("Su nombre es Santiago y no tiene 23 años");
        } else if (!nombre.equals("Santiago") && edad == 23) {
            System.out.println("Su nombre no es Santiago y tiene 23 años");
        } else {
            System.out.println("No se llama Santiago ni tiene 23 años");
        }
    }
}
