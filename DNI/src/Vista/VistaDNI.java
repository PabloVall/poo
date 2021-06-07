package Vista;

import Controlador.DNI_Controlador;
import java.util.Scanner;
import modelo.DNI;

/**
 *
 * @author Pablo
 */
public class VistaDNI {
    private final DNI_Controlador controladorDNI;
    public Scanner teclado;
    public VistaDNI(DNI_Controlador controladorDNI){ //nunca crear nuevo controlador
        this.controladorDNI=controladorDNI;
        teclado=new Scanner(System.in);
    }
    public void menu(){
        int opcion=0;
        do{
            System.out.println(" 1.crear \n 2.buscar \n 3.actualizar \n 4.eliminar \n 5.listar \n 6.salir");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1: this.crear();break;
                case 2: this.Actualizar();break;
                case 3: this.buscar();break;
                case 4:this.eliminar();break;
                case 5:this.listar();break;
            }
        }while(opcion<6);
    }
    public void crear(){
        System.out.println("Ingrese \n numero");
        String numero=teclado.next();
        System.out.println("El código de verifiacción");
        int codigoverificacion=teclado.nextInt();
        System.out.println("CREADO "+ controladorDNI.crear(numero, codigoverificacion));
    }
    public void Actualizar(){
        System.out.println("Ingrese \n numero");
        String numero=teclado.next();
        System.out.println("código de verificación");
        int codigoverificacion=teclado.nextInt();
        System.out.println("creado "+ controladorDNI.actualizar(numero, codigoverificacion));
    }
    public DNI buscar(){
        System.out.println("Ingrese \n numero");
        String numero=teclado.next();
        System.out.println(controladorDNI.buscar(numero));
        return controladorDNI.buscar(numero);
    }
    public void eliminar(){
        this.buscar();
        System.out.println("eliminado "+controladorDNI.eliminar(controladorDNI.getSeleccionado().getNumero()));
    }
    public void listar(){
        controladorDNI.getListaDNI().forEach(dni -> {
            System.out.println(dni);
        });
    }
}
