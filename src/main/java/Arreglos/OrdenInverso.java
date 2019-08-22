package Arreglos;

import javax.swing.*;

public class OrdenInverso {

    public int[] invertirOrden(int[] numeros){
        int[] numerosInversos = new int[10];
        int contador = 0;

        for(int i=9; i>=0; i--){
            numerosInversos[contador] = numeros[i];
            contador++;
        }

        return numerosInversos;
    }
}
