#include <iostream>

using namespace std;

int main() {
    int A, B;

    cout << "Ingrese valor: ";
    cin >> A;
    cout << "Ingrese valor: ";
    cin >> B;

    // Operaciones básicas
    int suma = A + B;
    cout << "La suma de los numeros es: " << suma << endl;

    int res = A - B;
    cout << "La resta de los numeros es: " << res << endl;

    int multi = A * B;
    cout << "La multiplicacion de los numeros es: " << multi << endl;

    float div = static_cast<float>(A) / B;
    cout << "La division de los numeros es: " << div << endl;

    // Comparaciones
    bool igual = (A == B);
    cout << "Los numeros son iguales: " << (igual ? "Si" : "No") << endl;

    if (A > B) {
        cout << "El numero mayor es: " << A << endl;
        cout << "El numero menor es: " << B << endl;
    } else if (A < B) {
        cout << "El numero mayor es: " << B << endl;
        cout << "El numero menor es: " << A << endl;
    } else {
        cout << "Ambos numeros son iguales." << endl;
    }

    return 0;
}
