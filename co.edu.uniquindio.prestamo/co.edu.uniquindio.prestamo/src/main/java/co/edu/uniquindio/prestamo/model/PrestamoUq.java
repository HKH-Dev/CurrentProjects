package co.edu.uniquindio.prestamo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrestamoUq {
    private String nombre;
    List<Objeto> listaObjetos = new ArrayList<>();

    public PrestamoUq() {
    }
    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Objeto> getListaObjectos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    //CRUD
    //Create
  public boolean agregarObjectos(String codigoObjeto, String nombre, String categoria, String marca, double precio){
      Objeto objeto = new Objeto();
      objeto.setCodigoObjeto(codigoObjeto);
      objeto.setNombre(nombre);
      objeto.setCategoria(categoria);
      objeto.setMarca(marca);
      objeto.setPrecio(precio);
      getListaObjectos().add(objeto);
        return true;
    }

    public List<Objeto> obtenerObjetos() {
        return getListaObjectos();
    }
    //Read

    /**
     * Mostrar informacion del objeto
     * @param prestamoUq
     */
    public void mostrarInformacionObjeto(PrestamoUq prestamoUq) {
        List<Objeto> listaObjeto = prestamoUq.obtenerObjetos();
        int tamanioLista = listaObjeto.size();
        for (int i = 0; i < tamanioLista; i++) {
            Objeto objeto = listaObjeto.get(i);
            System.out.println(objeto.toString());
        }
    }

    /**
     * Metodo para actualizar el objeto
     * @param codigoObjeto
     * @param nuevoNombre
     * @param nuevaCategoria
     * @param nuevaMarca
     * @param nuevoPrecio
     * @return True or False
     */
    //Update
    public boolean actualizarObjeto(String codigoObjeto, String nuevoNombre, String nuevaCategoria, String nuevaMarca, double nuevoPrecio) {
        for (Objeto objeto : listaObjetos) {
            if (objeto.getCodigoObjeto().equalsIgnoreCase(codigoObjeto)) {
                objeto.setNombre(nuevoNombre);
                objeto.setCategoria(nuevaCategoria);
                objeto.setMarca(nuevaMarca);
                objeto.setPrecio(nuevoPrecio);
                return true; // Object updated successfully
            }
        }
        return false; // Object with the given code not found
    }

    /**
     * Metodo para eliminar un objeto de la lista
     */
    public void eliminarObjecto() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduce el codigo de identificacion del Objeto");

        String codigoObjecto = userInput.next();

        int tamanioLista = getListaObjectos().size();
        for (int i=0; i < tamanioLista; i++){
            Objeto objeto = getListaObjectos().get(i);
            if(objeto.getCodigoObjeto().equalsIgnoreCase(codigoObjecto)){
                getListaObjectos().remove(i);
                break;
            }
        }
    }



    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
