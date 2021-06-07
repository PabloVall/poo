package Vista;

import Controlador.EmpresaControlador;
import java.util.Scanner;
import modelo.Cliente;
import modelo.Empresa;

/**
 *
 * @author Pablo
 */
public class empresaVista{
    private EmpresaControlador empresaControlador;
    private Scanner teclado;
    public empresaVista(){ //mi constructor en vista siempre lo creo yo mismo
        empresaControlador=new EmpresaControlador();
        teclado= new Scanner(System.in);
    }
    public void menu(){
       int op=0;
       do{
            System.out.println("\n Gestion Empresa");
            System.out.println("1.Crear");
            System.out.println("2.Actualizar");
            System.out.println("3.Buscar");
            System.out.println("4.Eliminar");
            System.out.println("5.Listar");
            System.out.println("6.Salir");
            op=teclado.nextInt();
            switch(op){
                case 1:this.crear();break;
                case 2:this.actualizar();break;
                case 3:this.buscar();break;
                case 4:this.eliminar();break;
                case 5:this.imprimir();break;
            }     
       }while(op<6);
    }
    public void crear(){
        System.out.println("Ingresr los datos a continuación");
        System.out.println("Id:");
        long id=teclado.nextLong();
        System.out.println("Nombre:");
        String nombre=teclado.next();
        boolean  resultado= empresaControlador.crear(id, nombre);
        System.out.println("Creado:"+resultado);
    }
    public  void actualizar(){
        System.out.println("Nombre:");
        String nombreAnterior=teclado.next();
        System.out.println("Nombre nuevo:");
        String nombreNuevo=teclado.next();
        boolean resultado= empresaControlador.actualizar(nombreAnterior, nombreNuevo);
        System.out.println("Actualizado"+resultado);
    }
    public Empresa buscar(){ //cambio void,esto para relacion de cliente en vistaGenteral
        System.out.println("Nombre:");
        String nombre=teclado.next();
        Empresa empresa=empresaControlador.buscar(nombre);
        System.out.println(empresa);
        empresaControlador.setSeleccionado(empresa); //le pongo en seleccionado de empresa, solo en buscar o en otro proceso
        return empresa;
    }
    public void eliminar(){
        System.out.println("Nombre:");
        String nombre=teclado.next();
        boolean resultado=empresaControlador.eliminar(nombre);
        System.out.println("Eliminado:"+resultado);
    }
    public void imprimir(){
        for(Empresa empresa: empresaControlador.getListaEmpresa()){
            System.out.println(empresa);
            this.imprimirClientes(empresa);
        }
    }
    public void imprimirClientes(Empresa empresa){
        for(Cliente cliente:empresa.getListaCliente()){
            System.out.println(cliente);
        }
    
}
//creo un encapsulamiento para alterarla
    public EmpresaControlador getEmpresaControlador() {
        return empresaControlador;
    }

    public void setEmpresaControlador(EmpresaControlador empresaControlador) {
        this.empresaControlador = empresaControlador;
    }
    
    
}
