package Arreglos;

import javax.swing.*;

public class OrdenInverso {
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void ingresarNumeros(){
        for(int i=0; i<9; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        }
    }

    public int[] invertirOrden(){
        int[] numerosInversos = new int[10];

        for(int i=9; i>0; i--){
            for(int j=0; j<numeros.length; j++){
                numerosInversos[j] = numeros[i];
            }
        }

        return numerosInversos;
    }
}
