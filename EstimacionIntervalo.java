/* muestra de tamaño 10 de una población con una 
distribución normal de probabilidad. Dices que la
media de la muestra es 14, y quieres calcular un 
intervalo de confianza del 95% para la media de la población.
Supongamos que utilizarás el intervalo típico de confianza para este problema.
12 13 14 15 16 17 18 19 20 21 todo esto menos 14 y se eleva al cuadrado*/

package com.mycompany.estadisticadescip;
import java.util.Scanner;

public class EstimacionIntervalo {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int muestra, elemento,i=1;
    double intervaloIs=0,
            confianzaZ,
            resta,
            sumatoria=0,
            potencia=0,
            resultado,
            divicionEs,
            confianzaIntev,
            intervaloDer;
float media;

 System.out.println("Introduzca el tamaño de la muestra, 'n=?' ");
         muestra = entrada.nextInt();
        
         System.out.println("A continuacion calcularemos la desviacion estandar  \n");
        
         System.out.println("Introduzca la media muestral que te dio el enunciado");
         media = entrada.nextFloat();
         
         do{
            System.out.println("Introduzca un elemento de la muestra");
            elemento = entrada.nextInt();
            
            
            resta = elemento - media;
            potencia = Math.pow(resta,2);
            sumatoria += potencia;

            i++;
        }while(i <=muestra);
         
         resultado = Math.sqrt(sumatoria);
         divicionEs= resultado/(muestra -1);

     System.out.println("La desviacion estandar de la muestra es: "+divicionEs);

     System.out.println("A continuacion calcularemos el rango del intervalo \n");

     System.out.println("Introduzca  Z si esta en porcentaje ubica el mismo en la tabla de confianza");
     confianzaZ = entrada.nextDouble();
     System.out.println("Ok tenemos la media: "+media+" tenemos Z: "+confianzaZ+" Y divicion Estandar"+divicionEs);


     confianzaIntev = divicionEs * confianzaZ;
System.out.println("El intervalo de confianza para la media de la poblacion \n"+confianzaIntev+"\n");

        intervaloIs= media + confianzaIntev;
System.out.println("El intervalo superior  \n"+intervaloIs);



intervaloDer= media - confianzaIntev;
System.out.println("El intervalo inferior  \n"+intervaloDer);

        
        
        
        }
}