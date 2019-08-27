package Arreglos;

import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        double[] temperaturas = new double[23];
        double suma = 0, media = 0, max=-99, min=99;

        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < temperaturas.length; i++) {
            System.out.println("Ingrese la temperatura: ");
            double tem = entrada.nextDouble();
            suma += tem;
            temperaturas[i] = tem;

            if(tem > max){
                max = tem;
            }

            if(tem < min){
                min = tem;
            }
        }

        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i] == min){
                System.out.println(i + " ********** " + temperaturas[i] + " --> MIN");
            }
            else if(temperaturas[i] == max){
                System.out.println(i + " ********** " + temperaturas[i] + " --> MAX");
            }
            else{
                System.out.println(i + " ********** " + temperaturas[i]);
            }

        }
        media = suma/24;
        System.out.println("La media es: " + media);
    }
}
