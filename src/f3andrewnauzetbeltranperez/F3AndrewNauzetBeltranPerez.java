package f3andrewnauzetbeltranperez;

public class F3AndrewNauzetBeltranPerez {

    public static void main(String[] args) {
        Agenda agenda = new Agenda(20);

        boolean salir = false;
        while (!salir) {
            EntradaSalida.imprimirMenu();
            int opcion = EntradaSalida.leerNumero();
            switch (opcion) {
                case 1:
                    if (agenda.getContactosRegistrados() != agenda.getMaxContactos()) {
                        EntradaSalida.imprimirCadena("Nombre: ");
                        String nombre = EntradaSalida.leerNombre();
                        EntradaSalida.imprimirCadena("Teléfono: ");
                        String telefono = EntradaSalida.leerTelefono();
                        agenda.contactoNuevo(nombre, telefono);
                    } else {
                        EntradaSalida.imprimirCadena("Agenda llena");
                    }
                    break;
                case 2:
                    EntradaSalida.imprimirCadena("Introduce nombre a buscar: ");
                    EntradaSalida.imprimirCadena(agenda.buscarNumeroPorNombre(EntradaSalida.leerNombre()));
                    break;
                case 3:
                    agenda.ordenarAgendaPorNombre();
                    for (int i = 0; i < agenda.getContactosRegistrados(); i++) {
                        EntradaSalida.imprimirCadena(agenda.infoContacto(i));
                    }
                    break;
                case 4:
                    agenda.ordenarAgendaPorNombre();
                    agenda.guardarAgenda();
                    break;
                case 5:
                    agenda.cargarAgenda();
                    break;
                case 6:
                    salir = true;
            }
        }
    }

}
