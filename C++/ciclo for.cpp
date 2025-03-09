#include <iostream>
#include <cmath> // Biblioteca para funciones matemáticas como pow()
using namespace std;

int main() {
    // Capturar el primer número
    cout << "Ingrese el primer valor: ";
    int A;
    cin >> A;

    // Capturar el exponente
    cout << "Ingrese el segundo valor: ";
    int C;
    cin >> C;

    // Calcular la potencia
    double valor = pow(A, C);

    // Mostrar el resultado
    cout << "La potencia de " << A << " sobre " << C << " es: " << valor << endl;

    return 0;
}
