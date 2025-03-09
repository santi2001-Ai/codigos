#include <iostream>
using namespace std;

int main() {
    // Variables para almacenar voltaje, resistencia e intensidad
    double Voltaje, Resistencia, Intensidad;

    // Solicitar datos al usuario
    cout << "Ingrese el valor del voltaje del circuito: ";
    cin >> Voltaje;

    cout << "Ingrese el valor de la resistencia del circuito: ";
    cin >> Resistencia;

    // Calcular la intensidad (corriente)
    Intensidad = Voltaje / Resistencia;

    // Mostrar resultado
    cout << "Al conectar un resistor de R " << Resistencia << " ohm a una fuente de V " 
         << Voltaje << " volts, circulará una corriente de " << Intensidad << " amperios." << endl;

    return 0;
}
