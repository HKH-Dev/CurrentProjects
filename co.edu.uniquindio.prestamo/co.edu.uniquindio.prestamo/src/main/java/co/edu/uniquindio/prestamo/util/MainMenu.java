package co.edu.uniquindio.prestamo.util;

import co.edu.uniquindio.prestamo.util.CapturarDatosUtil;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class MainMenu {
    public static void main(String[] args) {
        String codigoObjeto = CapturarDatosUtil.leerStringConsola("Introduce el codigo de identificacion del Objeto");
    }

    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------------------------\n");
        System.out.println("Bienvenido al sistema de prestamos de la Universidad del Quindio\n");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Seleccione una opcion\n");
        System.out.println("1 - Acceder a la informacion de los objetos");
        System.out.println("2 - Agregar Objeto");
        System.out.println("3 - Actualizar Objeto");
        System.out.println("4 - Eliminar Objeto");
        System.out.println("5 - Salir\n");
    }

    CapturarDatosUtil capturarDatosUtil = new CapturarDatosUtil();

/*    public static void createObject = CapturarDatosUtil.rellenarArray();
    {
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un número");
            lista[i]=Integer.parseInt(texto);
        }

    }*/
}
