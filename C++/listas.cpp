#include <iostream>
#include <vector>
#include <variant>
using namespace std;

int main() {
    // Lista de días de la semana
    vector<string> Lista = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};

    // Imprimir el elemento en la posición 4
    cout << Lista[4] << endl;  // Mostrará "Viernes"

    // Imprimir la lista completa
    cout << "Lista completa: ";
    for (string dia : Lista) {
        cout << dia << " ";
    }
    cout << endl;

    // Imprimir los primeros 3 elementos
    cout << "Primeros 3 días: ";
    for (int i = 0; i < 3; i++) {
        cout << Lista[i] << " ";
    }
    cout << endl;

    // Lista con múltiples tipos de datos usando `variant`
    vector<variant<string, int, double, bool>> ListaCompleta = {
        "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", 1, 2, 3,
        vector<variant<string, double, int, bool>>{"Santiago", 0.2, 2.25, true}
    };

    // Imprimir los primeros 4 elementos de ListaCompleta
    cout << "Primeros 4 elementos: ";
    for (int i = 0; i < 4; i++) {
        cout << get<string>(ListaCompleta[i]) << " ";
    }
    cout << endl;

    // Imprimir los primeros 3 elementos de la sublista en la posición 9
    vector<variant<string, double, int, bool>> sublista = get<vector<variant<string, double, int, bool>>>(ListaCompleta[9]);
    
    cout << "Sublista: ";
    for (int i = 0; i < 3; i++) {
        if (i == 0) 
            cout << get<string>(sublista[i]) << " ";
        else 
            cout << get<double>(sublista[i]) << " ";
    }
    cout << endl;

    return 0;
}
