#include <iostream>
#include <vector>
using namespace std;

struct Persona {
    string nombre;
    int edad;
};

int main() {
    // Lista de nombres
    vector<string> nombres = {"Santiago", "Hans", "Jhon", "Juan Pablo"};

    // Imprimir nombres
    for (const string& nombre : nombres) {
        cout << nombre << endl;
    }

    // Lista de personas con edad
    vector<Persona> Personas = {
        {"Santiago", 23},
        {"Hans", 27},
        {"Jhon", 41},
        {"Juan Pablo", 23}
    };

    // Imprimir los datos de cada persona
    cout << "\nLista de personas y edades:" << endl;
    for (const Persona& persona : Personas) {
        cout << persona.nombre << ": " << persona.edad << " años" << endl;
    }

    // Calcular la edad promedio
    int total_edad = 0;
    for (const Persona& persona : Personas) {
        total_edad += persona.edad;
    }
    double edad_promedio = static_cast<double>(total_edad) / Personas.size();
    cout << "\nEdad promedio: " << edad_promedio << " años" << endl;

    return 0;
}
