#include <iostream>
using namespace std;

int main() {
    int Figura;
    const double Pi = 3.1416;
    const int Const = 2;

    // Solicitar la figura al usuario
    cout << "Seleccione la figura para calcular su área:\n";
    cout << "1 para rombo\n";
    cout << "2 para rectángulo\n";
    cout << "3 para cuadrado\n";
    cout << "4 para trapecio\n";
    cout << "Ingrese su opción: ";
    cin >> Figura;

    double Area;

    switch (Figura) {
        case 1: { // Rombo
            double Dmayor, Dmenor;
            cout << "Ingrese el valor de la diagonal mayor: ";
            cin >> Dmayor;
            cout << "Ingrese el valor de la diagonal menor: ";
            cin >> Dmenor;
            Area = (Dmayor * Dmenor) / Const;
            cout << "El área del rombo es: " << Area << endl;
            break;
        }
        case 2: { // Rectángulo
            double Largo, Ancho;
            cout << "Ingrese el valor del largo del rectángulo: ";
            cin >> Largo;
            cout << "Ingrese el valor del ancho del rectángulo: ";
            cin >> Ancho;
            Area = Largo * Ancho;
            cout << "El área del rectángulo es: " << Area << endl;
            break;
        }
        case 3: { // Cuadrado
            double Lado;
            cout << "Ingrese el valor del lado del cuadrado: ";
            cin >> Lado;
            Area = Lado * Lado;
            cout << "El área del cuadrado es: " << Area << endl;
            break;
        }
        case 4: { // Trapecio
            double Bmayor, Bmenor, H;
            cout << "Ingrese el valor de la base mayor: ";
            cin >> Bmayor;
            cout << "Ingrese el valor de la base menor: ";
            cin >> Bmenor;
            cout << "Ingrese la altura del trapecio: ";
            cin >> H;
            Area = ((Bmayor + Bmenor) * H) / 2;
            cout << "El área del trapecio es: " << Area << endl;
            break;
        }
        default:
            cout << "Opción no válida." << endl;
    }

    return 0;
}
