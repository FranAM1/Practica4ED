package practica4;

public abstract class Persona {
    private String nombre;
    private String DNI;
    private int edad;

    /**
     * Constructor completo de la clase Persona
     * @param nombre atributo nombre
     * @param DNI atributo DNI
     * @param edad atributo edad
     */
    public Persona(String nombre, String DNI, int edad){
        this.nombre=nombre;
        this.DNI=DNI;
        this.edad=edad;
    }


    /**
     * Constructor vacio de la clase Persona
     */
    public Persona(){

    }

    /**
     * Metodo toString. Devuelve la información de la clase superior y sus atributos
     * @return Clase padre del objeto y sus atributos
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre= " + nombre + '\n' +
                ", DNI= " + DNI + '\n' +
                ", edad= " + edad + '\n' +
                '}';
    }

    /**
     * Actualiza el valor del atributo nombre
     * @param nombre: nuevo valor del atrbuto nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Actualiza el valor del atributo DNI
     * @param DNI: nuevo valor del atributo DNI
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Actualiza el valor del atributo edad
     * @param edad: nuevo valor del atributo edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo getNombre. Devuelve el valor del atributo nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo getDNI. Devuelve el valor del atributo DNI
     * @return DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Metodo getEdad. Devuelve el valor del atributo edad
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
}