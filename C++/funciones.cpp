#include <iostream>
#include <vector>
using namespace std;

int main() {
    // Arrays de números
    int a[] = {1, 2, 3, 4, 5};
    int b[] = {6, 7, 8, 9, 10};
    vector<int> c;

    // Multiplicar los valores correspondientes y almacenarlos en 'c'
    for (int i = 0; i < 5; i++) {
        c.push_back(a[i] * b[i]);
    }

    // Imprimir los resultados
    cout << "Resultado de la multiplicación: ";
    for (int i = 0; i < c.size(); i++) {
        cout << c[i] << " ";
    }
    cout << endl;

    return 0;
}

// Definición de funciones

// Función para mostrar un texto
void mostrar_texto() {
    cout << "Hola" << endl;
}

// Función para multiplicar dos números fijos
void multiplicar() {
    int a = 5, b = 8;
    cout << a * b << endl;
}

// Multiplicación con variables globales
int a = 5, b = 8;
void multiplicar_global() {
    cout << a * b << endl;
}

// Función que devuelve un resultado
int multiplicar_con_return() {
    int a = 5, b = 8;
    return a * b;
}

// Función que devuelve un booleano según una condición
bool validar_dato() {
    if (a == 5) {
        return true;
    } else {
        return false;
    }
}

int main_functions() {
    // Llamadas a las funciones
    mostrar_texto();
    multiplicar();
    multiplicar_global();

    int Resultado = multiplicar_con_return();
    cout << "Resultado + 5: " << Resultado + 5 << endl;

    bool dato = validar_dato();
    cout << "Validación del dato: " << dato << endl;

    return 0;
}
