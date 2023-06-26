
//Importación de clases externas
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    // Declaración de variables
    static Scanner sc = new Scanner(System.in);
    static String[] clubes = new String[6];
    static int[] puntos = new int[6];
    static int[] goles = new int[6];
    static int ganador = Integer.MIN_VALUE;
    static String campeon = "a";

    public static void main(String[] args) throws Exception {
        System.out.println("\n¡Bienvenido al nuevo diseño del mundial de clubes!");
        System.out.println(
                "\nLa competición va a enfrentar a todos los equipos entre sí, el que sume más puntos al final de la última fecha ganará");

        clubs(); // Solicita los nombres de los clubes participantes

        fecha1(); // Realiza la fecha y actualiza los resultados y puntos.
        tablaPosiciones(); // Muestra la tabla de posiciones después de la fecha.

        fecha2();
        tablaPosiciones();

        fecha3();
        tablaPosiciones();

        fecha4();
        tablaPosiciones();

        fecha5();
        tablaPosiciones();

        System.out.println("\nLa tabla de posiciones final es la siguiente:");
        tablaPosiciones(); // Muestra la tabla de posiciones final

        // Determina al ganador (equipo con más puntos)
        for (int i = 0; i < puntos.length; i++) {
            if (puntos[i] > ganador) {
                ganador = puntos[i];
                campeon = clubes[i];
            }
        }

        System.out.println("\nEl equipo campeón de la liga es " + campeon + " con " + ganador + " puntos\n");
    }

    // Solicita los nombres de los clubes participantes
    public static void clubs() {
        System.out
                .println("\nIngresa los 6 equipos que participarán en la Liga del Mundial de Clubes (uno a la vez): ");

        for (int i = 0; i < clubes.length; i++) {
            clubes[i] = sc.nextLine();
        }
    }

    public static void fecha1() {
        System.out.println("\nLos enfrentamientos de la fecha 1 son: ");
        // Muestra los enfrentamientos
        System.out.println(clubes[0] + " vs " + clubes[1]);
        System.out.println(clubes[2] + " vs " + clubes[3]);
        System.out.println(clubes[4] + " vs " + clubes[5]);

        System.out.println("\nIngrese los resultados de la fecha 1: ");
        // Obtiene los resultados de cada partido
        System.out.print(clubes[0] + " vs " + clubes[1] + ": ");
        int resultado1Equipo1 = sc.nextInt();
        int resultado1Equipo2 = sc.nextInt();

        System.out.print(clubes[2] + " vs " + clubes[3] + ": ");
        int resultado2Equipo1 = sc.nextInt();
        int resultado2Equipo2 = sc.nextInt();

        System.out.print(clubes[4] + " vs " + clubes[5] + ": ");
        int resultado3Equipo1 = sc.nextInt();
        int resultado3Equipo2 = sc.nextInt();

        System.out.println(clubes[0] + " " + resultado1Equipo1 + " - " + clubes[1] + " " + resultado1Equipo2);
        System.out.println(clubes[2] + " " + resultado2Equipo1 + " - " + clubes[3] + " " + resultado2Equipo2);
        System.out.println(clubes[4] + " " + resultado3Equipo1 + " - " + clubes[5] + " " + resultado3Equipo2);

        actualizarPuntos(resultado1Equipo1, resultado1Equipo2, 0, 1);
        actualizarPuntos(resultado2Equipo1, resultado2Equipo2, 2, 3);
        actualizarPuntos(resultado3Equipo1, resultado3Equipo2, 4, 5);

        System.out.println("\nLa tabla de posiciones después de la fecha 1 es: ");
    }

    public static void fecha2() {
        System.out.println("\nLos enfrentamientos de la fecha 2 son: ");

        System.out.println(clubes[0] + " vs " + clubes[2]);
        System.out.println(clubes[1] + " vs " + clubes[4]);
        System.out.println(clubes[3] + " vs " + clubes[5]);

        System.out.println("\nIngrese los resultados de la fecha 2: ");

        System.out.print(clubes[0] + " vs " + clubes[2] + ": ");
        int resultado1Equipo1 = sc.nextInt();
        int resultado1Equipo2 = sc.nextInt();

        System.out.print(clubes[1] + " vs " + clubes[4] + ": ");
        int resultado2Equipo1 = sc.nextInt();
        int resultado2Equipo2 = sc.nextInt();

        System.out.print(clubes[3] + " vs " + clubes[5] + ": ");
        int resultado3Equipo1 = sc.nextInt();
        int resultado3Equipo2 = sc.nextInt();

        System.out.println(clubes[0] + " " + resultado1Equipo1 + " - " + clubes[2] + " " + resultado1Equipo2);
        System.out.println(clubes[1] + " " + resultado2Equipo1 + " - " + clubes[4] + " " + resultado2Equipo2);
        System.out.println(clubes[3] + " " + resultado3Equipo1 + " - " + clubes[5] + " " + resultado3Equipo2);

        actualizarPuntos(resultado1Equipo1, resultado1Equipo2, 0, 2);
        actualizarPuntos(resultado2Equipo1, resultado2Equipo2, 1, 4);
        actualizarPuntos(resultado3Equipo1, resultado3Equipo2, 3, 5);

        System.out.println("\nLa tabla de posiciones después de la fecha 2 es: ");
    }

    public static void fecha3() {
        System.out.println("\nLos enfrentamientos de la fecha 3 son: ");

        System.out.println(clubes[0] + " vs " + clubes[3]);
        System.out.println(clubes[1] + " vs " + clubes[5]);
        System.out.println(clubes[2] + " vs " + clubes[4]);

        System.out.println("\nIngrese los resultados de la fecha 3: ");

        System.out.print(clubes[0] + " vs " + clubes[3] + ": ");
        int resultado1Equipo1 = sc.nextInt();
        int resultado1Equipo2 = sc.nextInt();

        System.out.print(clubes[1] + " vs " + clubes[5] + ": ");
        int resultado2Equipo1 = sc.nextInt();
        int resultado2Equipo2 = sc.nextInt();

        System.out.print(clubes[2] + " vs " + clubes[4] + ": ");
        int resultado3Equipo1 = sc.nextInt();
        int resultado3Equipo2 = sc.nextInt();

        System.out.println(clubes[0] + " " + resultado1Equipo1 + " - " + clubes[3] + " " + resultado1Equipo2);
        System.out.println(clubes[1] + " " + resultado2Equipo1 + " - " + clubes[5] + " " + resultado2Equipo2);
        System.out.println(clubes[2] + " " + resultado3Equipo1 + " - " + clubes[4] + " " + resultado3Equipo2);

        actualizarPuntos(resultado1Equipo1, resultado1Equipo2, 0, 3);
        actualizarPuntos(resultado2Equipo1, resultado2Equipo2, 1, 5);
        actualizarPuntos(resultado3Equipo1, resultado3Equipo2, 2, 4);

        System.out.println("\nLa tabla de posiciones después de la fecha 3 es: ");
    }

    public static void fecha4() {
        System.out.println("\nLos enfrentamientos de la fecha 4 son: ");

        System.out.println(clubes[0] + " vs " + clubes[4]);
        System.out.println(clubes[1] + " vs " + clubes[3]);
        System.out.println(clubes[2] + " vs " + clubes[5]);

        System.out.println("\nIngrese los resultados de la fecha 4: ");

        System.out.print(clubes[0] + " vs " + clubes[4] + ": ");
        int resultado1Equipo1 = sc.nextInt();
        int resultado1Equipo2 = sc.nextInt();

        System.out.print(clubes[1] + " vs " + clubes[3] + ": ");
        int resultado2Equipo1 = sc.nextInt();
        int resultado2Equipo2 = sc.nextInt();

        System.out.print(clubes[2] + " vs " + clubes[5] + ": ");
        int resultado3Equipo1 = sc.nextInt();
        int resultado3Equipo2 = sc.nextInt();

        System.out.println(clubes[0] + " " + resultado1Equipo1 + " - " + clubes[4] + " " + resultado1Equipo2);
        System.out.println(clubes[1] + " " + resultado2Equipo1 + " - " + clubes[3] + " " + resultado2Equipo2);
        System.out.println(clubes[2] + " " + resultado3Equipo1 + " - " + clubes[5] + " " + resultado3Equipo2);

        actualizarPuntos(resultado1Equipo1, resultado1Equipo2, 0, 4);
        actualizarPuntos(resultado2Equipo1, resultado2Equipo2, 1, 3);
        actualizarPuntos(resultado3Equipo1, resultado3Equipo2, 2, 5);

        System.out.println("\nLa tabla de posiciones después de la fecha 4 es: ");
    }

    public static void fecha5() {
        System.out.println("\nLos enfrentamientos de la fecha 5 son: ");

        System.out.println(clubes[0] + " vs " + clubes[5]);
        System.out.println(clubes[1] + " vs " + clubes[2]);
        System.out.println(clubes[3] + " vs " + clubes[4]);

        System.out.println("\nIngrese los resultados de la fecha 5: ");

        System.out.print(clubes[0] + " vs " + clubes[5] + ": ");
        int resultado1Equipo1 = sc.nextInt();
        int resultado1Equipo2 = sc.nextInt();

        System.out.print(clubes[1] + " vs " + clubes[2] + ": ");
        int resultado2Equipo1 = sc.nextInt();
        int resultado2Equipo2 = sc.nextInt();

        System.out.print(clubes[3] + " vs " + clubes[4] + ": ");
        int resultado3Equipo1 = sc.nextInt();
        int resultado3Equipo2 = sc.nextInt();

        System.out.println(clubes[0] + " " + resultado1Equipo1 + " - " + clubes[5] + " " + resultado1Equipo2);
        System.out.println(clubes[1] + " " + resultado2Equipo1 + " - " + clubes[2] + " " + resultado2Equipo2);
        System.out.println(clubes[3] + " " + resultado3Equipo1 + " - " + clubes[4] + " " + resultado3Equipo2);

        actualizarPuntos(resultado1Equipo1, resultado1Equipo2, 0, 5);
        actualizarPuntos(resultado2Equipo1, resultado2Equipo2, 1, 2);
        actualizarPuntos(resultado3Equipo1, resultado3Equipo2, 3, 4);

        System.out.println("\nLa tabla de posiciones después de la fecha 5 es: ");
    }

    public static void actualizarPuntos(int resultadoEquipo1, int resultadoEquipo2, int indiceEquipo1,
            int indiceEquipo2) {
        if (resultadoEquipo1 > resultadoEquipo2) {
            puntos[indiceEquipo1] += 3; // Equipo 1 gana
        } else if (resultadoEquipo1 < resultadoEquipo2) {
            puntos[indiceEquipo2] += 3; // Equipo 2 gana
        } else {
            puntos[indiceEquipo1] += 1; // Empate
            puntos[indiceEquipo2] += 1;
        }

        goles[indiceEquipo1] += resultadoEquipo1 - resultadoEquipo2; // Sumar goles del equipo 1
        goles[indiceEquipo2] += resultadoEquipo2 - resultadoEquipo1; // Sumar goles del equipo 2
    }

    public static void tablaPosiciones() {
        // Crear una matriz de objetos Equipo para almacenar el nombre, puntos y goles
        // de cada equipo
        Equipo[] equipos = new Equipo[6];
        for (int i = 0; i < equipos.length; i++) {
            equipos[i] = new Equipo(truncarNombre(clubes[i], 3), puntos[i], goles[i]);
        }

        // Ordenar la matriz de equipos en orden descendente basado en los puntos y
        // goles
        Arrays.sort(equipos, Comparator.comparing(Equipo::getPuntos).thenComparing(Equipo::getGoles).reversed());

        // Mostrar la tabla de posiciones ordenada
        System.out.println("Club\t\tPuntos\t\tGoles");
        System.out.println("--------------------------------------");
        for (Equipo equipo : equipos) {
            System.out.println(equipo.getNombre() + "\t\t" + equipo.getPuntos() + "\t\t" + equipo.getGoles());
        }
    }

    public static String truncarNombre(String nombre, int maxLength) {
        if (nombre.length() > maxLength) {
            return nombre.substring(0, maxLength);
        }
        return nombre;
    }

    // Clase auxiliar para representar un equipo con nombre, puntos y goles
    static class Equipo {
        private String nombre;
        private int puntos;
        private int goles;

        public Equipo(String nombre, int puntos, int goles) {
            this.nombre = nombre;
            this.puntos = puntos;
            this.goles = goles;
        }

        public String getNombre() {
            return nombre;
        }

        public int getPuntos() {
            return puntos;
        }

        public int getGoles() {
            return goles;
        }
    }
}