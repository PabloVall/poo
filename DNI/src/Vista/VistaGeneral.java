package Vista;

import Controlador.ControladorFecha;
import Controlador.ControladorPersona;
import Controlador.ControladorRegistro;
import Controlador.DNI_Controlador;
import java.util.Scanner;
import modelo.DNI;
import modelo.Fecha;
import modelo.Persona;

/**
 *
 * @author Pablo
 */
public class VistaGeneral {
    private final Scanner teclado; 
    private VistaFecha vistaFecha;
    private final ControladorFecha controladorFecha;
    private final VistaPersona vistaPersona;
    private final ControladorPersona  controladorPersona;
    private final VistaRegistro vistaRegistro;
    private final ControladorRegistro controladorRegistro;
    private final VistaDNI vistaDNI;
    private final DNI_Controlador controladorDNI;
    public VistaGeneral(){
        teclado=new Scanner(System.in);
        controladorFecha = new ControladorFecha();
        controladorDNI = new DNI_Controlador();
        controladorPersona = new ControladorPersona();
        controladorRegistro = new ControladorRegistro();
        vistaFecha = new VistaFecha(controladorFecha);
        vistaFecha = new VistaFecha(controladorFecha);
        vistaDNI = new VistaDNI(controladorDNI);
        vistaPersona = new VistaPersona(controladorPersona, controladorFecha, controladorDNI);
        vistaRegistro = new VistaRegistro(controladorRegistro, controladorPersona);
        
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Gestión de los registros");
            System.out.println(" 1. Fecha \n 2. DNI \n 3. Persona \n 4. Registro \n 5. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: vistaFecha.menu(); break;
                case 2: vistaDNI.menu(); break;
                case 3: this.persona();break;
                case 4: this.registro();break;
            }
        } while (opcion < 5);
    }
    public void persona(){
        Fecha  fecha = vistaFecha.buscar();
        DNI dni = vistaDNI.buscar();
        if(fecha != null && dni != null){
            vistaPersona.menu();
        }
    }
    public void registro(){
        Persona persona = vistaPersona.buscar();
        if(persona != null){
            vistaRegistro.menu();
        }
    }

    
}
