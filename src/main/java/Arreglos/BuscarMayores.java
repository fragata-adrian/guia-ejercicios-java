
package Arreglos;

import java.util.Scanner;

public class BuscarMayores {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] mayores = new int[numeros.length];
        int entero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        entero = entrada.nextInt();

        for(int i=0; i<numeros.length; i++){

            if(entero < numeros[i]){
                mayores[i] = numeros[i];
            }
        }

        for(int i: mayores){
            System.out.println("Los mayores son: ");
            if(i > 0){
                System.out.println(i);
            }
        }
    }
}


