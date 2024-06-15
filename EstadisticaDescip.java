    /* Ejercicio de matematica Estimacion puntual */
    /* Se obtuvo una muestra aleatoria de la cantidad pagada en dolares 
po un viaje en taxis desde el centro de la ciudad al aeropuerto
15 19 17 23 21 17 16 18 12 18 20 22 15 18 20 use los datos para  
hallar una estimacion puntual para cada una de los siguientes parametros */

package com.mycompany.estadisticadescip;

/**
 *
 * @author mr-robots
 */

import java.util.Scanner;

public class EstadisticaDescip {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float media, 
              muestra,
              elemento,
              sumatoria=0;
             double potencia2,desviacionEs,varianza,mutiplicacion,potencia=0,total ;
        int i=1;
        char letra;
        System.out.println("Introduzca el numero de la muestra, 'n=?' ");
        muestra = entrada.nextFloat();
        
        do{
            System.out.println("Introduzca el siguiente elemento de la muestra");
            elemento = entrada.nextFloat();
            sumatoria += elemento; 
            potencia += Math.pow(elemento,2);
            i++;
        }while(i <=muestra);
               media = sumatoria/muestra;
                System.out.println("La media de la muestral es: "+ media); 
                
                System.out.println("Presione 'S' si desea conocer la varianza?");
                letra = entrada.next().charAt(0);
                
                
                potencia2 = Math.pow(media,2);
                mutiplicacion = (muestra*potencia2);
                varianza = potencia - mutiplicacion;
                total= varianza/(muestra-1);
                System.out.println("La varianza es:"+letra+":"+total );
                
                System.out.println("La desviacion estandar  es:\n");
                desviacionEs= Math.sqrt(total);
                System.out.println(desviacionEs);

                
    }
}
