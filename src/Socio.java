import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Socio extends Usuario {
    private List<Prestamo> hprestamos = new ArrayList<>();
    private List<Sancion> hsanciones = new ArrayList<>();
    private Integer nIdentificativo;

    public Socio(Integer nIdentificativo, int ntlf, String usuario, String direccion, String dni, String nombre) {
        super(dni,nombre,direccion,ntlf);
        this.nIdentificativo = nIdentificativo;
    }

    static public void tieneSancion(Socio socio){
    }

    static public void sancionar(Socio socio, Date duracion, String motivo){
    }
}
