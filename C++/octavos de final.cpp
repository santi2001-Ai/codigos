#include <iostream>
#include <vector>
#include <map>
#include <cstdlib>
#include <ctime>

using namespace std;

int main() {
    // Inicializar la semilla para generar números aleatorios
    srand(time(0));

    // Lista de partidos (pares de equipos)
    vector<pair<string, string>> partidos = {
        {"Paises Bajos", "Corea del Sur"}, {"Senegal", "Portugal"}, {"Inglaterra", "Suiza"}, 
        {"USA", "Brazil"}, {"Argentina", "Croacia"}, {"Polonia", "Marruecos"}, 
        {"Francia", "España"}, {"Australia", "Japon"}
    };

    // Diccionario para almacenar los resultados
    map<int, int> resultados;

    // Lista de equipos que avanzan a la siguiente ronda
    vector<string> equipos_pasan;

    // Iterar sobre los partidos
    for (size_t i = 0; i < partidos.size(); i++) {
        string equipo1 = partidos[i].first;
        string equipo2 = partidos[i].second;

        // Generar un resultado aleatorio (0, 1 o 2)
        int resultado = rand() % 3;  // 0 -> gana equipo2, 1 -> empate, 2 -> gana equipo1

        // Almacenar el resultado en el diccionario
        resultados[i] = resultado;

        // Imprimir el resultado del partido
        if (resultado == 2) {
            cout << equipo1 << " gana contra " << equipo2 << endl;
            equipos_pasan.push_back(equipo1); // El equipo1 avanza
        } 
        else if (resultado == 1) {
            cout << "Empate entre " << equipo1 << " y " << equipo2 << endl;
            // En empate, ningún equipo avanza
        } 
        else {
            cout << equipo1 << " pierde contra " << equipo2 << endl;
            equipos_pasan.push_back(equipo2); // El equipo2 avanza
        }
    }

    // Mostrar los resultados finales
    cout << "\nResultados finales:" << endl;
    for (const auto& resultado : resultados) {
        cout << "Partido " << resultado.first + 1 << ": Resultado " << resultado.second << endl;
    }

    // Mostrar los equipos que avanzan a la siguiente ronda
    cout << "\nEquipos que pasan a la siguiente ronda:" << endl;
    for (const string& equipo : equipos_pasan) {
        cout << equipo << endl;
    }

    return 0;
}
