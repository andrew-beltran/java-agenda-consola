package f3andrewnauzetbeltranperez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaSalida {

    static Scanner sc = new Scanner(System.in);

    static int leerNumero() {
        int numero = 0;
        try {
            numero = sc.nextInt();
        } catch (InputMismatchException ime) {
            imprimirCadena("introduce un valor corecto");
        }
        sc.nextLine();
        return numero;
    }

    static void imprimirMenu() {
        imprimirCadena("1. Añadir contacto"
                + System.lineSeparator() + "2. Buscar número por nombre"
                + System.lineSeparator() + "3. Mostrar todo"
                + System.lineSeparator() + "4. Guardar agenda"
                + System.lineSeparator() + "5. Cargar agenda"
                + System.lineSeparator() + "6. Salir");
    }

    static String leerNombre() {
        return sc.nextLine();
    }

    static String leerTelefono() {
        boolean telefonoCorrecto = false;
        String telefono = "";
        while (!telefonoCorrecto) {
            telefono = sc.next();
            try {
                telefonoCorrecto = Integer.parseInt(telefono) > 0;
            } catch (NumberFormatException nfe) {
                imprimirCadena("Introduce un número válido");
            }
        }
        return telefono;
    }

    static void imprimirCadena(String cadena) {
        System.out.println(cadena);
    }
}
