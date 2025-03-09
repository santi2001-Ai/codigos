#include <iostream>
using namespace std;

int main() {
    int a = 2;

    // Condición simple
    if (a == 2) {
        cout << "a vale 2" << endl;
    } else {
        cout << "a es diferente de 2" << endl;
    }

    // Concatenación de condiciones
    string Nombre = "Santiago";
    int Edad = 23;
    string Pais = "Colombia";

    if (Nombre == "Santiago" && Edad == 23 && Pais == "Colombia") {
        cout << "Su nombre es " << Nombre << ", tiene " << Edad << " y es de " << Pais << endl;
    } else if (Nombre == "Santiago" && Edad != 23) {
        cout << "Su nombre es Santiago y no tiene 23 años" << endl;
    } else if (Nombre != "Santiago" && Edad == 23) {
        cout << "Su nombre no es Santiago y tiene 23 años" << endl;
    } else {
        cout << "No se llama Santiago ni tiene 23 años" << endl;
    }

    return 0;
}
