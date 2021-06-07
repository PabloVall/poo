package modelo;

/**
 *
 * @author Pablo
 */
public class Persona {
    private long id; 
    private String nombreCompleto;
    private Fecha fecha; //unidireccional
    private DNI dni;

    public Persona(long id, String nombreCompleto) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }

    public Persona(long id, String nombreCompleto, Fecha fecha, DNI dni) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fecha = fecha;
        this.dni = dni;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getnombreCompleto() {
        return nombreCompleto;
    }

    public void setnombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", nombrecompleto=" + nombreCompleto + ", fecha=" + fecha + ", dni=" + dni + '}';
    }
    

    
}
