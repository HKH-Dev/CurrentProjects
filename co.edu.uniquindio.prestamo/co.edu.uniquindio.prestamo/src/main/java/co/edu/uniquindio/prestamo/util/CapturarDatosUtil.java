package co.edu.uniquindio.prestamo.util;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CapturarDatosUtil {
    /**
     * Metodo para leer una String por consola
     * @param mensaje
     * @return Un String ingresado por consola
     */

    public static String leerStringConsola(String mensaje)
    {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }

    /**
     * Metodo para invocar las funciones
     * @param args
     */
    public static void main(String[] args) {
        final int TAMANIO=10;
        int num[]=new int[TAMANIO];
        rellenarArray(num);
        mostrarArray(num);
    }

    /**
     * Metodo para actualizar un arreglo en el punto deseado
     * @param lista
     */
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un número");
            lista[i]=Integer.parseInt(texto);
        }
    }

    /**
     * Metodo para imprimir el arreglo
     * @param lista
     */
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }

}
