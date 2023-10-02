package co.edu.uniquindio.prestamo.model;

public class Objeto {
    private String codigoObjeto;
    private String nombre;
    private String categoria;
    private String marca;
    private double precio;

    PrestamoUq ownedByPrestamoUq;

    public Objeto() {
    }

    /**
     * Constructor de la clase Objeto
     * @param codigoObjeto
     * @param nombre
     * @param categoria
     * @param marca
     * @param precio
     */
    public Objeto(String codigoObjeto, String nombre, String categoria, String marca, double precio) {
        this.codigoObjeto = codigoObjeto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.marca = marca;
        this.precio = precio;
    }

    public String getCodigoObjeto() {
        return codigoObjeto;
    }

    public void setCodigoObjeto(String codigoObjeto) {
        this.codigoObjeto = codigoObjeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

 /*   public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }*/

    @Override
    public String toString() {
        return "Objeto{" +
                "codigoObjeto='" + codigoObjeto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}