package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Objeto;
import co.edu.uniquindio.prestamo.model.PrestamoUq;
import co.edu.uniquindio.prestamo.util.MainMenu;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrestamoUq prestamoUq = inializarDatosPrueba();

        //CRUD

        //Create
        agregarObjetos("001", "Televisor", "Entrenimiento", "Samsung", 2500, prestamoUq);
        agregarObjetos("002", "Celular", "Dispositivos moviles", "Apple", 1300, prestamoUq);
        agregarObjetos("003", "Laptop", "Computacion", "Razer", 4500, prestamoUq);
        agregarObjetos("004", "Airpods", "Audio", "Sony", 280, prestamoUq);

        MainMenu mostrarMenu = new MainMenu();
        mostrarMenu.mostrarMenu();


        Scanner userInput = new Scanner(System.in);
        int userOption = userInput.nextInt();

        do {
            mostrarMenu.mostrarMenu();
            userOption = userInput.nextInt();
            if (userOption >= 1 && userOption <= 5)
            {
                switch (userOption) {
                    case 1: //READ
                        mostrarInformacionObjeto(prestamoUq);
                        break;
                    case 2://CREATE
                        System.out.println("Agregar Objeto");
                        System.out.println("Introduce el codigo de identificacion del Objeto");
                        String codigoObjeto = userInput.next();
                        System.out.println("Introduce el nombre del Objeto");
                        String nombre = userInput.next();
                        System.out.println("Introduce la categoria del Objeto");
                        String categoria = userInput.next();
                        System.out.println("Introduce la marca del Objeto");
                        String marca = userInput.next();
                 /*       agregarObjetos(userInput.next();*/
                        System.out.println("Introduce el precio del Objeto");
                        double precio = userInput.nextDouble();
                        agregarObjetos(codigoObjeto, nombre, categoria, marca, precio, prestamoUq);

                        System.out.println("-----> Informacion luego de agregar");
                        mostrarInformacionCliente(prestamoUq);
                        break;

                    case 3://UPDATE
                        System.out.println("Actualizar Objeto");
                        break;
                    case 4://DELETE
                        System.out.println("Eliminar Objeto");
                        eliminarObjecto(prestamoUq);
                        System.out.println("-----> Informacion luego de eliminar");
                        mostrarInformacionCliente(prestamoUq);
                        break;
                    case 5://EXIT
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        } while (userOption != 5);
    }

        private static PrestamoUq inializarDatosPrueba() {
            PrestamoUq prestamoUq = new PrestamoUq();
            prestamoUq.setNombre("Prestamo Uq");
            return prestamoUq;
        }
        private static void mostrarInformacionObjeto(PrestamoUq prestamoUq) {
            prestamoUq.mostrarInformacionObjeto(prestamoUq);
        }

        private static void agregarObjetos(String codigoObjeto, String nombre, String categoria, String marca, double precio, PrestamoUq prestamoUq) {
            prestamoUq.agregarObjectos(codigoObjeto, nombre, categoria, marca, precio);
        }

        private static void eliminarObjecto(PrestamoUq prestamoUq) {
            prestamoUq.eliminarObjecto();
        }

        private static void mostrarInformacionCliente(PrestamoUq prestamoUq) {
            List<Objeto> listaObjeto = prestamoUq.obtenerObjetos();
            int tamanioLista = listaObjeto.size();
            for (int i = 0; i < tamanioLista; i++) {
                Objeto objeto = listaObjeto.get(i);
                System.out.println(objeto.toString());
            }
        }
}