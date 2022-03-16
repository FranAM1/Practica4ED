package practica4;

public abstract class Mascota implements Sonido{
    private String nombre;
    private int edad;

    /**
     * Constructor vacio
     */
    public Mascota(){

    }

    /**
     * Constructor completo
     *
     * @param nombre: nuevo valor del atributo nombre
     * @param edad: nuevo valor del atributo edad
     */
    public Mascota(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Metodo toString. Devuelve la informacion de la clase a la que pertenece y los atributos
     *
     * @return Clase del objetos y sus atributos en formato String.
     */
    @Override
    public String toString() {
        return "Mascota{\n" +
                "nombre= " + nombre + '\n' +
                "edad= " + edad + '\n' +
                '}';
    }

    /**
     * Metodo getNombre. Devuelve el valor del atributo nomnbre
     *
     * @return atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setNombre. Actualiza el valor del atributo nombre
     *
     * @param nombre: nuevo valor del atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *  Metodo getEdad. Devuelve el valor del atributo edad
     *
     * @return atributo edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo setEdad. Actualiza el valor del atributo edad
     *
     * @param edad: nuevo valor del atributo edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
