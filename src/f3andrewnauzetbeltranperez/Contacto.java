package f3andrewnauzetbeltranperez;

public class Contacto implements Comparable<Contacto> {

    private final String nombre;
    private final String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return telefono;
    }

    @Override
    public int compareTo(Contacto o) {
        return this.nombre.compareTo(o.nombre);
    }
}
