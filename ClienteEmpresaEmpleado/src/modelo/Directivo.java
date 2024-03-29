package modelo;

/**
 *
 * @author Pablo
 */
public class Directivo extends Empleado{ 
    private String categoria;

    public Directivo(long id, String cedula, String nombre, String apellido, String direccion, double SueldoBruto) { //usamos el que tiene todos los datos
        super(id, cedula, nombre, apellido, direccion, SueldoBruto);
    }

    public Directivo( long id, String cedula, String nombre, String apellido, String direccion, double SueldoBruto,String categoria) {
        super(id, cedula, nombre, apellido, direccion, SueldoBruto); //super es la clase padre de esta clase
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Direc{" + "categoria=" + categoria +super.toString()+ '}';
    }
    
}
