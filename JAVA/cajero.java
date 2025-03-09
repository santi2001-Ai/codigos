import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    private String nombre;
    private int pin;
    private int saldo;

    public Usuario(String nombre, int pin, int saldo) {
        this.nombre = nombre;
        this.pin = pin;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPin() {
        return pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

class Banco {
    private ArrayList<Usuario> usuarios;

    public Banco(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public boolean autenticar(String nombre, int pin) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                if (usuario.getPin() == pin) {
                    System.out.println("¡Estas logeado!");
                    return true;
                } else {
                    System.out.println("Pin incorrecto.");
                    return false;
                }
            }
        }
        System.out.println("El usuario no existe.");
        return false;
    }

    public void sacarDinero(String nombre, int monto) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                if (usuario.getSaldo() < monto) {
                    System.out.println("Saldo insuficiente.");
                    return;
                } else {
                    usuario.setSaldo(usuario.getSaldo() - monto);
                    System.out.println("Retiro exitoso. El saldo disponible es: " + usuario.getSaldo());
                    return;
                }
            }
        }
    }
}

public class CajeroAutomatico {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario ana = new Usuario("Ana", 9872, 450);
        Usuario pablo = new Usuario("Pablo", 5555, 200);
        Usuario rodrigo = new Usuario("Rodrigo", 2222, 900);

        // Agregar usuarios al banco
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(ana);
        listaUsuarios.add(pablo);
        listaUsuarios.add(rodrigo);
        Banco banco = new Banco(listaUsuarios);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al Banco, por favor, identifíquese.");
            System.out.print("Introduzca el nombre: ");
            String nombre = scanner.next();

            System.out.print("Introduzca el pin: ");
            int pin = scanner.nextInt();

            if (banco.autenticar(nombre, pin)) {
                while (true) {
                    System.out.println("Por favor, elija una opción:");
                    System.out.println("1. Sacar dinero");
                    System.out.println("2. Terminar sesión");
                    System.out.print("Opción: ");
                    String opcion = scanner.next();

                    if (opcion.equals("1")) {
                        System.out.print("Introduce cantidad a sacar: ");
                        int monto = scanner.nextInt();
                        banco.sacarDinero(nombre, monto);
                    } else if (opcion.equals("2")) {
                        System.out.println("Saliendo del sistema.");
                        break;
                    } else {
                        System.out.println("Opción incorrecta. Por favor, introduzca otra opción.");
                    }
                }
            } else {
                System.out.println("Usuario no autenticado. Por favor, introduzca nombre y pin correctos.");
            }
        }
    }
}
