package co.edu.uniquindio.prestamo.model;

import java.util.ArrayList;
import java.util.List;

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


    /**
     * Metodo para obtener la lista de todos los clientes
     * @return List<Cliente>
     */
    public List<Objeto> obtenerObjetos() {
        return getListaObjectos();
    }

    public void eliminarObjecto(String codigoObjecto) {
        int tamanioLista = getListaObjectos().size();
        for (int i=0; i < tamanioLista; i++){
            Objeto objeto = getListaObjectos().get(i);
            if(objeto.getCodigoObjeto().equalsIgnoreCase(codigoObjecto)){
                getListaObjectos().remove(i);
                break;
            }
        }
    }

    public void mostrarInformacionObjeto(PrestamoUq prestamoUq) {
        List<Objeto> listaObjeto = prestamoUq.obtenerObjetos();
        int tamanioLista = listaObjeto.size();
        for (int i = 0; i < tamanioLista; i++) {
            Objeto objeto = listaObjeto.get(i);
            System.out.println(objeto.toString());
        }
    }

    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
