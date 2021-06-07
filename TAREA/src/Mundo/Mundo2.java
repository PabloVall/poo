package Mundo;

/**
 *
 * @author Pablo
 */
public class Mundo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=15;
        if(a>=20){
            System.out.println("Número es = o < a 20");
        }else if (a>=10){
            System.out.println("Número < o = a 10");
        }else if(a<20){
            System.out.println("Número > a 20 ");
        }else{
            System.out.println("eNúmero > a 15");
        }
        System.out.println("HOLA MUNDO");
        
        int b=1;
        switch(a){
            case 1:System.out.println("Lunes");
            break;
            case 2:System.out.println("Martes");
            break;
            case 3:System.out.println("Miercoles");
            break;
            case 4:System.out.println("Jueves");
            break;
            case 5:System.out.println("Viernes");
            break;
            case 6:System.out.println("Sábado");
            break;
            default:System.out.println("Domingo");
            break;
        }
        
    }
}
