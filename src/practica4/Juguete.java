package practica4;

public class Juguete {
    private String nombre;
    private int precio;
    private int edadRecomendada;

    /**
     * Constrcutor completo de Juguete
     * @param nombre atributo nombre
     * @param precio atributo precio
     * @param edadRecomendada atributo edad recomendada
     */
    public Juguete(String nombre, int precio, int edadRecomendada){
        this.nombre = nombre;
        this.precio = precio;
        this.edadRecomendada = edadRecomendada;
    }

    /**
     * Constructor vacio de Juguete
     */
    public Juguete(){

    }

    /**
     * Metodo toString. Devuelve la información de la clase superior y sus atributos
     * @return Clase del objeto y sus atributos
     */
    @Override
    public String toString() {
        return "Juguete{" +
                "nombre= " + nombre + '\n' +
                ", precio= " + precio + '\n' +
                ", edadRecomendada= " + edadRecomendada + '\n' +
                '}';
    }

    /**
     * Actualiza el valor del atributo nombre
     * @param nombre: nuevo valor de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Actualiza el valor del atributo precio
     * @param precio: nuevo valor de precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Actualiza el valor del atributo edadRecomendada
     * @param edadRecomendada: nuevo valor de edadRecomendada
     */
    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    /**
     * Metodo getNombre. Devuelve el valor del atributo nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo getPrecio. Devuelve el valor del atributo precio
     * @return precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Metodo getEdadRecomendada. Devuelve el valor del atributo edadRecoomendada
     * @return edadRecomendada
     */
    public int getEdadRecomendada() {
        return edadRecomendada;
    }
}
