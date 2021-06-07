package Vista;

import Controlador.EmpresaControlador;
import Controlador.controladorCliente;
import java.util.Scanner;
import modelo.Cliente;

/**
 *
 * @author Pablo
 */
public class Clientevista { //consola
    private final Scanner teclado;
    private controladorCliente clientecontrolador;
    //private Empresa empresa; //creo nuevo parametro de relacion cliente con empresa
    private EmpresaControlador empresaControlador; //unir ambos empresa controlador

    public Clientevista(EmpresaControlador empresaControlador){ //crear constructores manuales en 
        this.teclado =new Scanner(System.in);
        clientecontrolador =new controladorCliente();
        this.empresaControlador=empresaControlador;
    }
    public void menu(){
        int opcion=0;
        do{
            System.out.println("\nGestor de clientes");
            System.out.println("1.Crear");
            System.out.println("2.Actualizar");
            System.out.println("3.Buscar/leer");
            System.out.println("4.Eliminar");
            System.out.println("5.Listar/imprimir");
            System.out.println("6.Salir");
            opcion= teclado.nextInt();
            switch(opcion){
                case 1: 
                    this.crear(); break;
                case 2: 
                    this.actualizar();break;
                case 3: 
                    this.buscar();break;
                case 4: 
                    this.eliminar();break;
                case 5:
                    System.out.println("Lista Cliebtes");
                    clientecontrolador.imprimir();break;
            }
        }while(opcion<6);
    }
    private void crear() {
        System.out.println("ingrese los datos a continuación");
        System.out.println("Id: ");
        long id=teclado.nextLong();
        System.out.println("nombre: ");
        String nombre=teclado.next();
        System.out.println("apellido: ");
        String apellido=teclado.next();
        System.out.println("Cédula");
        String cedula=teclado.next();
        boolean  resultado=clientecontrolador.crear(id, nombre, apellido, cedula,empresaControlador.getSeleccionado());
        System.out.println("Cliente creado: "+resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar");
        System.out.println("Cedula: ");
        String cedula=teclado.next();
        System.out.println("Nombre: ");
        String nombre=teclado.next();
        System.out.println("Apellido; ");
        String apellido=teclado.next();
        boolean resultado=clientecontrolador.actualizar(cedula, nombre, apellido);
        System.out.println("Cliente actualizado: "+resultado);
    }
    public Cliente buscar(){
        System.out.println("Ingresar cédula:");
        System.out.println("Cédula;");
        String cedula=teclado.next();
        Cliente cliente=clientecontrolador.buscar(cedula); //tipo cliente
        System.out.println(cliente);
        return cliente;
    }
    public void eliminar(){
        System.out.println("Eliminar cliente");
        System.out.println("Cédula: ");
        String cedula=teclado.next();
        boolean resultado=clientecontrolador.eliminar(cedula);
        System.out.println("Cliente actualizado: "+resultado);
    }
    public void asignarSeleccionado(Cliente cliente){
        clientecontrolador.setSeleccionado(cliente);
    }

    public controladorCliente getClientecontrolador() {
        return clientecontrolador;
    }

    public void setClientecontrolador(controladorCliente clientecontrolador) {
        this.clientecontrolador = clientecontrolador;
    }

    public EmpresaControlador getEmpresaControlador() {
        return empresaControlador;
    }

    public void setEmpresaControlador(EmpresaControlador empresaControlador) {
        this.empresaControlador = empresaControlador;
    }

    
}    
    

    
