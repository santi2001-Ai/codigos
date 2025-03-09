import java.util.*;

public class LlavesOctavosFinal {
    public static void main(String[] args) {
        Random random = new Random();

        // Lista de partidos
        String[][] partidos = {
            {"Paises Bajos", "Corea del Sur"}, {"Senegal", "Portugal"}, {"Inglaterra", "Suiza"},
            {"USA", "Brazil"}, {"Argentina", "Croacia"}, {"Polonia", "Marruecos"},
            {"Francia", "España"}, {"Australia", "Japon"}
        };

        // Mapa para almacenar los resultados
        Map<Integer, Integer> resultados = new HashMap<>();

        // Lista para almacenar los equipos que pasan a la siguiente ronda
        List<String> equiposPasan = new ArrayList<>();

        // Iterar sobre cada partido
        for (int i = 0; i < partidos.length; i++) {
            String equipo1 = partidos[i][0];
            String equipo2 = partidos[i][1];

            int resultado = random.nextInt(3); // Generar un resultado aleatorio (0, 1 o 2)

            // Guardar el resultado en el mapa
            resultados.put(i, resultado);

            // Imprimir el resultado del partido y determinar qué equipo pasa
            if (resultado == 2) {
                System.out.println(equipo1 + " gana contra " + equipo2);
                equiposPasan.add(equipo1); // equipo1 pasa a la siguiente ronda
            } else if (resultado == 1) {
                System.out.println("Empate entre " + equipo1 + " y " + equipo2);
                // No se agrega ningún equipo si hay empate
            } else {
                System.out.println(equipo1 + " pierde contra " + equipo2);
                equiposPasan.add(equipo2); // equipo2 pasa a la siguiente ronda
            }
        }

        // Imprimir todos los resultados
        System.out.println("\nResultados finales: " + resultados);

        // Imprimir los equipos que pasan a la siguiente ronda
        System.out.println("\nEquipos que pasan a la siguiente ronda:");
        for (String equipo : equiposPasan) {
            System.out.println(equipo);
        }
    }
}
