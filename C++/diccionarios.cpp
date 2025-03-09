#include <iostream>
#include <map>
using namespace std;

int main() {
    // Creación del diccionario usando un map
    map<string, string> coche = {
        {"marca", "Chana"},
        {"color", "blanco"},
        {"modelo", "sedan"},
        {"placa", "DAD190"}
    };

    // Imprimir el color del coche
    cout << coche["color"] << endl;

    // Cambiar el color del coche
    coche["color"] = "Negro";
    cout << coche["color"] << endl;

    // Imprimir la marca del coche
    cout << coche["marca"] << endl;

    // Cambiar la marca del coche
    coche["marca"] = "Renault";
    cout << coche["marca"] << endl;

    // Imprimir todo el diccionario
    cout << "Datos del coche:" << endl;
    for (const auto& par : coche) {
        cout << par.first << ": " << par.second << endl;
    }

    return 0;
}
