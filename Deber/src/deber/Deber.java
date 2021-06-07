package deber;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Deber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ejercicio <1>Pprograma el cual permita determinar el grupo dependiendo de la edad");
        Scanner teclado=new Scanner(System.in);
        int a=teclado.nextInt();
        System.out.println(a);
        if (a<=2 && a>0){
            System.out.println("Pertenece a los bebes");
        }else if(a<=12 && a>2){
            System.out.println("Pertenece a los ninos");
        }else if(a<=18 && a>12){
            System.out.println("Pertenece a los jovenes");
        }else if(a<=64 && a>18){
            System.out.println("Pertenece a los adultos");
        }else{
            System.out.println("Pertenece a los adultos mayores");
        }
        
        System.out.println("Ejercicio <2> Programa que determine el mes segun su numero"); 
        int b=teclado.nextInt();
        System.out.println(b);
        switch(b){
            case 1: System.out.println("Enero");
            break;
            case 2: System.out.println("Febrero");
            break;
            case 3: System.out.println("Marzo");
            break;
            case 4: System.out.println("Abril");
            break;
            case 5: System.out.println("Mayo");
            break;
            case 6: System.out.println("Junio");
            break;
            case 7: System.out.println("Julio");
            break;
            case 8: System.out.println("Agosto");
            break;
            case 9: System.out.println("Septiembre");
            break;
            case 10: System.out.println("Octubre");
            break;
            case 11: System.out.println("Noviembre");
            break;
            case 12: System.out.println("Diciembre");
            break;
            default: System.out.println("No se acepta este numero");
            break;   
        } 
    }
    
}
