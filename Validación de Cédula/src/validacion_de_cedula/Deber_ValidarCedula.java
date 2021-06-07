package validacion_de_cedula;

/**
 *
 * @author Pablo
 */
public class Deber_ValidarCedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Verificar cédula: 0107376386");
        int[]    c={2,1,2,1,2,1,2,1,2}; //Multiplicador para los 9 primeros numeros de la cedula
        int suma=0;// variable que ayuda a sumar los productos
        int fin=0;  //segunda variable para diferencias
        boolean respuesta=false; //respuesta final
        int[] cedula={0,1,0,6,4,6,7,2,5,1}; //cedula
        for(int i=0;cedula.length-1>i;i++){  //proceso de multiplicacion 
            cedula[i]=cedula[i]*c[i];
            if(cedula[i]>=10){  //regla que ayuda a no tener valores mayores o iguales a 10
                cedula[i]=cedula[i]-9;
            }
            //System.out.println(cedula[i]);
            suma=suma+cedula[i]; //sumatoria de los productos
        }
        System.out.println(suma+"El total es ");
        if(suma>0 && suma<=10){
            //regla que ayuda a definir un valor mas especifico
            fin=10-suma;
        }else if(suma>10 && suma<=20){
            fin=20-suma;
        }else if(suma>20 && suma<=30){
            fin=30-suma;
        }else if(suma>30 && suma<=40){
            fin=40-suma;
        }else
            fin=50-suma;
        //System.out.println(fin);
        respuesta = fin==cedula[9]; //Verificamos que el resultado final sea igual al ultimo numero de cedula
        //System.out.println(respuesta);
        if(respuesta==true){
            System.out.println("La cédula ha sido verificada");
        }else
            System.out.println("La cédula es inválida");
    }
}
