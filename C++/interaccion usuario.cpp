#include <iostream>
#include <string>
using namespace std;

int main() {
    // Variables para almacenar los datos del usuario
    string nombres, apellidos, profesion;
    int anioNacimiento, edad;

    // Solicitar datos al usuario
    cout << "Escriba sus nombres completos: ";
    getline(cin, nombres);  // Captura nombres con espacios

    cout << "Escriba sus apellidos completos: ";
    getline(cin, apellidos);  // Captura apellidos con espacios

    cout << "Escriba su profesión: ";
    getline(cin, profesion);  // Captura profesión con espacios

    cout << "Escriba su año de nacimiento: ";
    cin >> anioNacimiento;

    // Calcular edad
    edad = 2025 - anioNacimiento;

    // Mostrar resultado
    cout << "El (La) " << profesion << " " << nombres << " " << apellidos << " tiene " << edad << " años." << endl;

    return 0;
}
