package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Pablo
 */
public class ControladorCliente {
    private List<Cliente> listaCliente;
    private Cliente seleccionado;
    public ControladorCliente(){
        listaCliente=new ArrayList();
        seleccionado=null;
    }
    public long generearId(){
        if(listaCliente.size()>0)
            return listaCliente.get(listaCliente.size()-1).getId()+1;
        else
            return 1;
    }
    public boolean crear( String cedula, String nombre, String apellido, String direccion,String telefono){
        Cliente cliente=new Cliente(this.generearId(), cedula, nombre, apellido, direccion,telefono);
        return listaCliente.add(cliente);
    }
    public Cliente buscar(String cedula){
        for (Cliente cliente : listaCliente) {
            if (cliente.getCedula().equals(cedula)) 
                return cliente;
        }
        return null;
    }
    public boolean actualizar(String cedula, String nombre, String apellido, String direccion,String telefono){
        Cliente cliente=this.buscar(cedula);
        if(cliente!=null){
            int posicion= listaCliente.indexOf(cliente);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setDireccion(direccion);
            cliente.setTelefono(telefono);
            listaCliente.set(posicion, cliente);
            return true;
        }
        return false;
    }
    public boolean eliminar(String cedula){
        Cliente cliente=this.buscar(cedula);
        if(cliente!=null){
            return listaCliente.remove(cliente);
        }
        return false;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Cliente getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Cliente seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
