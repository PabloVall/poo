package modelo;

import java.util.Date;

/**
 *
 * @author Pablo
 */
public class Registro {
    private long id;
    private String codigo;
    private Date fechaRegistro;
    private Persona persona;

    public Registro(long id, String codigo, Date fechaRegistro) {
        this.id = id;
        this.codigo = codigo;
        this.fechaRegistro = fechaRegistro;
    }

    public Registro(long id, String codigo, Date fechaRegistro, Persona persona) {
        this.id = id;
        this.codigo = codigo;
        this.fechaRegistro = fechaRegistro;
        this.persona = persona;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    

    @Override
    public String toString() {
        return "registro{" + "id=" + id + ", codigo=" + codigo + ", fechaRegistro=" + fechaRegistro + '}';
    }
    
}
