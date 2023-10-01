package co.edu.uniquindio.prestamo.util;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CapturarDatosUtil {
    public static String leerStringConsola(String mensaje)
    {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }

    public static void main(String[] args) {

        //Esto es opcional
        final int TAMANIO=10;

        int num[]=new int[TAMANIO];

        //Invocamos las funciones
        rellenarArray(num);

        mostrarArray(num);
    }

    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un número");
            lista[i]=Integer.parseInt(texto);
        }
    }

    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }

}
