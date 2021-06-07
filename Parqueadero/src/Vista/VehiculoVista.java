package Vista;

import Controlador.VehiculoControlador;
import Controlador.controladorCliente;
import java.util.Scanner;
import modelo.Vehiculo;

/**
 *
 * @author Pablo
 */
public class VehiculoVista {
    
    private controladorCliente clientecontrolador;
    private VehiculoControlador vehiculoControlador;
    private final Scanner teclado;
    
    public VehiculoVista(controladorCliente clientecontrolador){
        this.clientecontrolador= new controladorCliente();
        vehiculoControlador=new VehiculoControlador();
        teclado=new Scanner(System.in);
    }
    public void menu(){
        int opcion=0;
        do{
            System.out.println("Gestion vehicular");
            System.out.println("1.Crear");
            System.out.println("2.Buscar");
            System.out.println("3.Actualizar");
            System.out.println("4.Eliminar");
            System.out.println("5.Listar");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1: this.crear();break;
                case 2: this.buscar();break;
                case 3: this.actualizar();break;
                case 4: this.eliminar();break;
                case 5: this.imprimir();break;
            }
        }while(opcion<6);
    }
    public void crear(){
        System.out.println("Crear - Ingresar los datos a continuación");
        System.out.println("Placa: ");
        String placa=teclado.next();
        System.out.println("Marca: ");
        String marca=teclado.next();
        System.out.println("Modelo: ");
        String modelo=teclado.next();
        boolean  resultado=vehiculoControlador.crear(placa, marca, modelo,clientecontrolador.getSeleccionado());
        System.out.println("Cliente creado: "+resultado);        
    }
    public void actualizar(){
        System.out.println("Actualizar-ingresar los datos");
        System.out.println("Placa: ");
        String placa=teclado.next();
        System.out.println("Marca: ");
        String marca=teclado.next();
        System.out.println("Modelo: ");
        String modelo=teclado.next();
        boolean  resultado=vehiculoControlador.actualizar(placa, marca, modelo);
        System.out.println("Cliente creado: "+resultado);   
    }
    public Vehiculo buscar(){ //el metodo no es booleano
        System.out.println("Ingresar la placa:");
        String placa= teclado.next();
        Vehiculo vehiculo=vehiculoControlador.buscar(placa);
        System.out.println(vehiculo);
        return vehiculo;
    }
    public void eliminar(){
        System.out.println("Ingresar la placa:");
        String placa=teclado.next();
        boolean resultado=vehiculoControlador.eliminar(placa);
        System.out.println("Eliminado="+resultado);
    }
    public void imprimir(){
        for(Vehiculo vehiculo: vehiculoControlador.getListaVehiculo()){
            System.out.println(vehiculo);
        }
    }
    public void asignarSeleccionado(Vehiculo vehiculo){
        vehiculoControlador.setSeleccionado(vehiculo);
    }

    public controladorCliente getClientecontrolador() {
        return clientecontrolador;
    }

    public void setClientecontrolador(controladorCliente clientecontrolador) {
        this.clientecontrolador = clientecontrolador;
    }

    public VehiculoControlador getVehiculoControlador() {
        return vehiculoControlador;
    }

    public void setVehiculoControlador(VehiculoControlador vehiculoControlador) {
        this.vehiculoControlador = vehiculoControlador;
    }
    
}
