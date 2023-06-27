
// se importa la clase scanner y la clase ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // se declaran las variables, un scanner, y una variable ll lamada historia que
    // es un arraylist.
    static Scanner scanner = new Scanner(System.in);
    static int contador = 0;
    static String nombre, logeo;
    static String password, logeo2;
    static int montoinicial = 1000;
    static int operacion, cbu;
    static double ingreso, retiro;
    static ArrayList<String> historial = new ArrayList<>();

    // se declara el metodo para crear el usuario.
    public static void crearUsuario() {
        System.out.println("¡Bienvenido al cajero automático!");
        System.out.println("Para crear una nueva cuenta por favor siga los siguientes pasos.");
        System.out.print("Por favor ingrese su nombre completo: ");
        logeo = scanner.nextLine();
        System.out.print("Por favor ingrese una contraseña para su cuenta: ");
        logeo2 = scanner.nextLine();
        System.out.println("Usted se ha creado la cuenta correctamente.");
    }

    public static void main(String[] args) throws Exception {
        // se llama al metodo crearUsuario.
        crearUsuario();

        System.out.print("Tiene tres intentos para ingresar a su cuenta.");

        do {
            System.out.println();
            System.out.print("Por favor, ingrese su nombre completo: ");
            nombre = scanner.nextLine();
            contador++;
            System.out.print("Por favor, ingrese la contraseña de su cuenta: ");
            password = scanner.nextLine();
            // se utiliza .equals para comprarar los datos ingresados con el nombre y la
            // password.
            if (nombre.equals(logeo) && password.equals(logeo2)) {
                System.out.println();
                System.out.println("Accedió correctamente a su cuenta.");
                break;
            } else {
                System.out.println();
                System.out.println("Nombre o contraseña errónea. Intente de nuevo.");
                System.out.println();

            }

        } while (contador < 3);

        if (contador >= 3) {
            System.out.println("Excedió el límite de intentos.");
            // se corta el codigo cuando se ingresa tres veces mal.
            return;
        }
        System.out.println("Usted cuenta con 1000$ en la cuenta.");
        System.out.println();

        // se inicia el bucle do-while del cajero.
        do {
            System.out.println();
            System.out.println("Por favor, seleccione la opción que desea realizar: ");
            System.out.println("1- Ingresar dinero.");
            System.out.println("2- Retirar dinero.");
            System.out.println("3- Salir del cajero.");

            operacion = scanner.nextInt();

            switch (operacion) {
                case 1:

                    System.out.println("Dinero a ingresar:");
                    ingreso = scanner.nextDouble();
                    montoinicial += ingreso;
                    System.out.println(
                            "Usted ingreso: " + ingreso + "$" + " y le corresponde un saldo de: " + montoinicial + "$");
                    // historial.add agrega el ingreso al arrayList.
                    historial.add("Ingresó " + ingreso + "$");
                    break;

                case 2:

                    System.out.println("Dinero a retirar:");
                    retiro = scanner.nextDouble();
                    if (retiro > montoinicial) {
                        System.out.println("El monto ingresado es mayor que el saldo disponible.");
                    } else {
                        montoinicial -= retiro;
                        System.out.println("Usted retiró: " + retiro + " y tiene un saldo de: " + montoinicial);
                        // historial.add agrega el retiro al arrayList.
                        historial.add("Retiró " + retiro + "$");
                    }
                    break;
                case 3:

                    System.out.println("Saliendo del cajero...");
                    break;

                default:
                    System.out.println("La opción ingresada no es válida. Por favor, ingrese nuevamente.");
            }
            // se repite el bucle hasta que el usuario eliga la opcion numero 3.
        } while (operacion != 3);

        // al final se muestra el historial de transacciones con un for mejorado.

        System.out.println("Historial de transacciones:");
        for (String transaccion : historial) {
            System.out.println(transaccion);
        }

        scanner.close();
    }
}
