import java.util.Date;

abstract class Articulo {
    private int codigo;
    private String estado;
    private String titulo;
    private Integer anho;

    public void Reservar(Articulo articulo, Socio socio, Date duracion) {}
    public void Prestar(Articulo articulo, Socio socio, Date duracion) {}
}
