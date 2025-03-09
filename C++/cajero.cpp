#include <iostream>
#include <vector>
using namespace std;

// Clase Usuario
class Usuario {
public:
    string nombre;
    int pin;
    double saldo;

    // Constructor
    Usuario(string nombre, int pin, double saldo) {
        this->nombre = nombre;
        this->pin = pin;
        this->saldo = saldo;
    }
};

// Clase Banco
class Banco {
public:
    vector<Usuario> usuarios;

    // Constructor
    Banco(vector<Usuario> usuarios) {
        this->usuarios = usuarios;
    }

    // Método para autenticar usuario
    bool autenticar(string nombre, int pin) {
        for (Usuario& usuario : usuarios) {
            if (usuario.nombre == nombre) {
                if (usuario.pin == pin) {
                    cout << "Estas Logeado" << endl;
                    return true;
                } else {
                    cout << "Pin o nombre incorrecto" << endl;
                    return false;
                }
            }
        }
        cout << "El usuario no existe" << endl;
        return false;
    }

    // Método para sacar dinero
    void sacar_dinero(string nombre, double cantidad) {
        for (Usuario& usuario : usuarios) {
            if (usuario.nombre == nombre) {
                if (usuario.saldo < cantidad) {
                    cout << "Saldo insuficiente" << endl;
                } else {
                    usuario.saldo -= cantidad;
                    cout << "El saldo disponible es " << usuario.saldo << endl;
                }
                return;
            }
        }
        cout << "Usuario no encontrado" << endl;
    }
};

int main() {
    // Crear usuarios
    Usuario ana("Ana", 9872, 450);
    Usuario pablo("Pablo", 5555, 200);
    Usuario rodrigo("Rodrigo", 2222, 900);

    // Crear banco con los usuarios
    Banco banco({ana, pablo, rodrigo});

    while (true) {
        cout << "Bienvenido al Banco, por favor, identifíquese." << endl;
        cout << "Introduzca el nombre: ";
        string nombre;
        cin >> nombre;
        cout << "Introduzca el pin: ";
        int pin;
        cin >> pin;

        if (banco.autenticar(nombre, pin)) {
            while (true) {
                cout << "Por favor, elija una de estas opciones:\n1. Sacar dinero\n2. Terminar sesión." << endl;
                string opcion;
                cin >> opcion;

                if (opcion == "1") {
                    cout << "Introduce cantidad a sacar: ";
                    double cantidad;
                    cin >> cantidad;
                    banco.sacar_dinero(nombre, cantidad);
                } else if (opcion == "2") {
                    cout << "Saliendo del sistema." << endl;
                    break;
                } else {
                    cout << "Opción incorrecta. Por favor, introduzca otra opción." << endl;
                }
            }
        } else {
            cout << "Usuario no autenticado. Por favor, introduzca nombre y pin correctos." << endl;
        }
    }

    return 0;
}

