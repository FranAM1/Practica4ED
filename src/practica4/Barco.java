package practica4;

import java.util.Date;

public class Barco implements Sonido{
    private String nombre;
    private Date fechaConstruccion;
    private int numCamarotes;
    private Motor motor;

    /**
     * Constructor vacio
     */
    public Barco(){

    }

    /**
     * Constructor completo
     *
     * @param nombre: nuevo valor del atributo nombre
     * @param fechaConstruccion: nuevo valor del atributo fechaConstruccion
     * @param numCamarotes: nuevo valor del atributo numCamarotes
     * @param fabricante: nuevo valor del atributo fabricante del objeto motor
     * @param potencia: nuevo valor del atributo potencia del objeto motor
     * @param codigo: nuevo valor del atributo codigo del objeto motor
     */
    public Barco(String nombre, Date fechaConstruccion, int numCamarotes, String fabricante, String potencia, int codigo){
        this.nombre = nombre;
        this.fechaConstruccion = fechaConstruccion;
        this.numCamarotes = numCamarotes;
        motor = new Motor(fabricante, potencia, codigo);
    }

    /**
     * Metodo toString. Devuelve la informacion de la clase a la que pertenece y los atributos
     *
     * @return Clase del objetos y sus atributos en formato String.
     */
    @Override
    public String toString() {
        return "Barco{\n" +
                "nombre= " + nombre + '\n' +
                "fechaConstruccion= " + fechaConstruccion + '\n' +
                "numCamarotes= " + numCamarotes + '\n' +
                "motor= " + motor + '\n' +
                '}';
    }

    /**
     * Metodo sonido. Muestra por consola el sonido del barco
     */
    @Override
    public void sonido() {
        System.out.println("broooom broooom");
    }

    /**
     * Metodo getNombre. Devuelve el valor del atributo nombre
     *
     * @return atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setNombre
     *
     * @param nombre: nuevo valor del atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo getFechaConstruccion. Devuelve el valor del atributo fechaConstruccion
     *
     * @return atributo fechaConstruccion
     */
    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    /**
     * Metodo setFechaConstruccion. Actualiza el valor del atributo fechaConstruccion
     *
     * @param fechaConstruccion: nuevo valor del atributo fechaConstruccion
     */
    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    /**
     * Metodo getNumCamarotes. Actualiza el valor del atributo numCamarotes
     *
     * @return atributo numCamarotes
     */
    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    /**
     * Metodo getMotor. Devuelve el objeto motor del barco
     *
     * @return atributo motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Metodo setMotor. Actualiza el valor del objeto motor del barco
     *
     * @param motor: nuevo valor del atributo motor
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
