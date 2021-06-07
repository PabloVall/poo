package Vista;

import java.util.Scanner;
import modelo.Cliente;
import modelo.Empresa;
import modelo.Vehiculo;

/**
 *
 * @author Pablo
 */
public class VistaGeneral {
    private final Clientevista clientevista;
    private final empresaVista Empresavista;
    private final VehiculoVista vehiculovista;
    private final ServicioVista servicioVista;
    private final Scanner teclado;
    public VistaGeneral(){
        Empresavista=new empresaVista();
        clientevista=new Clientevista(Empresavista.getEmpresaControlador()); //unifico el controladorEmpresa en uno solo
        vehiculovista=new VehiculoVista(clientevista.getClientecontrolador());
        servicioVista=new ServicioVista(vehiculovista.getVehiculoControlador());
        teclado=new Scanner(System.in);
    }
    public void menu(){
        int op=0;
        do{
            System.out.println("Seleccionar una opción");
            System.out.println("1.Empresa");
            System.out.println("2.Cliente");
            System.out.println("3.Vehiculo");
            System.out.println("4.Servicio");
            op=teclado.nextInt();
            switch(op){
                case 1:Empresavista.menu();break;
                case 2:this.cliente();break;
                case 3:this.vehiculo();break;
                case 4:this.servicio();break;
            }
        }while(op<5);//para los demas modelos
    }
    public void cliente(){
        System.out.println("Seleccionar empresa para la gestión de clientes");
        Empresa empresa=Empresavista.buscar();
        if(empresa!=null){
            clientevista.menu();
        }else{
            System.out.println("Empresa no existente");
            this.cliente();
        }
    }
    public void vehiculo(){
        System.out.println("Seleccione un propietario para la gestión vehicular");
        Cliente cliente=clientevista.buscar();
        if(cliente!=null){
            clientevista.asignarSeleccionado(cliente);
            vehiculovista.menu();
        }else{
            System.out.println("Cliente no existente");
            this.vehiculo();
        }
    }//cuando se pone el asignado fuera del buscar en 
    
    public void servicio(){
        System.out.println("Seleccione un vehiculo para la gestión de los servicios");
        Vehiculo vehiculo= vehiculovista.buscar();
        if(vehiculo!=null){
            vehiculovista.asignarSeleccionado(vehiculo);
            vehiculovista.menu();
        }else{
            System.out.println("Vehiculo no existente");
            this.servicio();
        }
    }
}
