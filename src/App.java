import java.util.Scanner;

public class cajeroautomatico {
    public static void main(String[] args) throws Exception {
        int contador = 0;

        Integer tarjeta = 123456;
        Integer contraseña = 123;

        final int montoinicial = 1000;
        int operacion, cbu;
        double ingreso, retiro;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al cajero automático");
        System.out.println("Tiene tres intentos para ingresar a su cuenta.");

        do {

            System.out.print("Por favor, ingrese el número de su tarjeta: ");
            tarjeta = scanner.nextInt();
            contador++;
            System.out.print("Por favor, ingrese la contraseña de su tarjeta: ");
            contraseña = scanner.nextInt();

            if (tarjeta.equals(123456) && contraseña.equals(123)) {
                System.out.println();
                System.out.println("Accedió correctamente a su cuenta.");
                break;
            } else {
                System.out.println();
                System.out.println("Número de tarjeta o número de contraseña errónea.");
                System.out.println();

            }

        } while (contador < 3);

        if (contador >= 3) {
            System.out.println("Excedió el límite de intentos.");
            System.exit(0);
        }
        System.out.println("Usted cuenta con 1000$ en la cuenta.");
        System.out.println();
        System.out.println(
                "Por favor, seleccione la opción que desea realizar: \n 1- Ingresar dinero \n 2- Retirar dinero \n 3- Salir del cajero");

        do {
            operacion = scanner.nextInt();

            switch (operacion) {
                case 1:

                    System.out.println("Dinero a ingresar:");
                    ingreso = scanner.nextDouble();
                    System.out.println("Número de CBU al cual quiera ingresar el dinero:");
                    cbu = scanner.nextInt();
                    if (ingreso < montoinicial) {
                        System.out.println(
                                "Usted ingreso: " + ingreso + ", a el CBU: " + cbu + " y le corresponde un saldo de: "
                                        + (montoinicial - ingreso));
                    } else {
                        System.out.println("El monto ingresado supera al de la cuenta");
                    }
                    break;

                case 2:
                    System.out.println("Dinero a retirar:");
                    retiro = scanner.nextDouble();
                    System.out.println("Usted retiró: " + retiro + " y tiene un saldo de: " + (montoinicial - retiro));
                    break;

                case 3:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("La opción ingresada no es válida. Por favor, ingrese nuevamente.");
            }
        } while (operacion <= 0 || operacion >= 4);

        scanner.close();
    }
}
