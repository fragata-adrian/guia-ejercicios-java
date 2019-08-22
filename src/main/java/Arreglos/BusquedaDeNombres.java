package Arreglos;

import java.util.Scanner;

public class BusquedaDeNombres {
    public static void main(String[] args) {
        int nElementos = 0;
        String letra = "a";

        Scanner entradaCantidad = new Scanner(System.in);
        Scanner entradaNombre = new Scanner(System.in);
        Scanner entradaLetra = new Scanner(System.in);

        System.out.println("Cuantos nombres quiere ingresar? ");
        nElementos = entradaCantidad.nextInt();

        String[] companieros = new String[nElementos];

        for(int i=0; i < nElementos; i++){

            System.out.println("Ingrese nombre y apellido: ");
            companieros[i] = entradaNombre.nextLine();
        }


        while(!letra.equals("FIN")){
            System.out.println("Ingrese una letra: ");
            letra = entradaLetra.nextLine();

            for(String nombre: companieros){
                if(nombre.charAt(0) == letra.charAt(0)){
                    System.out.println(nombre);
                }
            }

        }
    }
}
