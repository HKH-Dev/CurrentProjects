package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Objeto;
import co.edu.uniquindio.prestamo.model.PrestamoUq;
import co.edu.uniquindio.prestamo.util.MainMenu;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       PrestamoUq prestamoUq = inializarDatosPrueba();

        MainMenu mostrarMenu = new MainMenu();
        mostrarMenu.mostrarMenu();


        Scanner userInput = new Scanner(System.in);
        int userOption = userInput.nextInt();

       //CRUD

        //Create
       agregarObjetos("001","Televisor", "Entrenimiento", "Samsung",2500,prestamoUq);
       agregarObjetos("002","Celular", "Dispositivos moviles", "Apple",1300,prestamoUq);
       agregarObjetos("003","Laptop", "Computacion", "Razer",4500, prestamoUq);
       agregarObjetos("004","Airpods", "Audio", "Sony",280,prestamoUq);

        do {
            mostrarMenu.mostrarMenu();
            userOption = userInput.nextInt();

            {
                switch (userOption) {
                    case 0:
                        mostrarInformacionObjeto(prestamoUq);

                        break;
                    case 1:
                        System.out.println("Agregar Objeto");
                        agregarObjetos(userInput.next(), userInput.next(), userInput.next(), userInput.next(), userInput.nextDouble(), prestamoUq);

                        break;
                    case 2:
                        System.out.println("Actualizar Objeto");
                        break;
                    case 3:
                        System.out.println("Eliminar Objeto");
                        break;
                    case 4:
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        } while (userOption != 4);



       //Read
/*       mostrarInformacionObjeto(prestamoUq);*/

       //Update

       //Delete
        eliminarObjecto(prestamoUq,"004");
        System.out.println("-----> Informacion luego de eliminar");
       mostrarInformacionCliente(prestamoUq);
    }

    private static PrestamoUq inializarDatosPrueba() {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamo Rapido");

        return prestamoUq;
    }

    private static void  mostrarInformacionObjeto(PrestamoUq prestamoUq){
        prestamoUq.mostrarInformacionObjeto(prestamoUq);
    }
    private static void agregarObjetos(String codigoObjeto, String nombre, String categoria, String marca, double precio, PrestamoUq prestamoUq) {
        prestamoUq.agregarObjectos(codigoObjeto, nombre, categoria, marca, precio);
    }

    private static void eliminarObjecto(PrestamoUq prestamoUq, String codigoObjeto) {
        prestamoUq.eliminarObjecto(codigoObjeto);
    }

    private static void mostrarInformacionCliente(PrestamoUq prestamoUq) {
        List<Objeto> listaObjeto = prestamoUq.obtenerObjetos();
        int tamanioLista = listaObjeto.size();
        for(int i=0; i < tamanioLista; i++){
            Objeto objeto = listaObjeto.get(i);
            System.out.println(objeto.toString());
        }
    }

}