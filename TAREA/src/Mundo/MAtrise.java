package Mundo;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class MAtrise {
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar el número de filas");
        int fila= teclado.nextInt();
        System.out.println("Ingresar el número de columnas");
        int columna=teclado.nextInt();
        double matriz[][]=new double[fila][columna];
        for (double[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = Math.random()*100;
            }
        }
        for (double[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("" + matriz1[j] + '\t');
            }
            System.out.println("");
        }  
        double suma=0;
        for (int a=0;a<matriz.length;a++){
            for (int j = 0; j < matriz.length; j++) {
                if (a==j){
                suma+=matriz[a][j];
                }
                }           
                }
        System.out.println("diagonal="+suma);
    }
}
