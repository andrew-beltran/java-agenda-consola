package f3andrewnauzetbeltranperez;

import java.util.Comparator;

public class OrdenarPorNumero implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        return Integer.parseInt(o1.getNumero()) - Integer.parseInt(o2.getNumero());
    }

}
