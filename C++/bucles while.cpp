#include <iostream>
using namespace std;

int main() {
    // Bucle while con contador
    int Contador = 0;
    while (Contador < 30) {
        Contador++;
        cout << "Iteración " << Contador << endl;
    }

    // Bucle while con if-else
    while (true) {
        cout << "Introduzca un valor mayor a 10: ";
        int a;
        cin >> a;

        if (a > 10) {
            cout << "Es correcto" << endl;
        } else {
            cout << "Es incorrecto, pruebe de nuevo" << endl;
            break; // Rompe el bucle si el valor no es mayor a 10
        }
    }

    return 0;
}
