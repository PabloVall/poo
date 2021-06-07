package Controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.DNI;

/**
 *
 * @author Pablo
 */
public class DNI_Controlador {
    private List<DNI> listaDNI;
    private DNI Seleccionado;
    
    public DNI_Controlador(){
        listaDNI=new ArrayList();
    }
    public long generarId(){
        if(listaDNI.size()>0)      //si su linea de accion es unicamente 1 no hay necesidad de llaves for if do while
            return listaDNI.get(listaDNI.size()-1).getId()+1;
        else
            return 1;
        
    }
    public boolean crear( String numero, int codigoVerificacion){
        return listaDNI.add(new DNI(this.generarId(), numero, codigoVerificacion));
        
    }
    public DNI buscar(String numero){
        for (DNI dni : listaDNI) {
            if(dni.getNumero().equals(numero)){
                Seleccionado = dni;
                return dni;
            }
        }
        return null;
    }
    public boolean actualizar(String numero, int codigoVerificacion){
        DNI dni = buscar(numero);
        if(dni != null){
            int posicion = listaDNI.indexOf(dni);
            dni.setCodigoVerificacion(codigoVerificacion);
            listaDNI.set(posicion, dni);
            return true;
        }
        return false;
    }
    public boolean eliminar(String numero){
        DNI dni = buscar(numero);
        return listaDNI.remove(dni);
    }

    public List<DNI> getListaDNI() {
        return listaDNI;
    }

    public void setListaDNI(List<DNI> listaDNI) {
        this.listaDNI = listaDNI;
    }

    public DNI getSeleccionado() {
        return Seleccionado;
    }

    public void setSeleccionado(DNI Seleccionado) {
        this.Seleccionado = Seleccionado;
    }
      
}
