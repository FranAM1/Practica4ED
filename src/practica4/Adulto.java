package practica4;

public class Adulto extends Persona{
    private String NSS;
    private String direccion;

    /**
     * Constructor completo de Adulto
     * @param NSS atributo NSS
     * @param direccion atributo Direccion
     * @param nombre atributo nombre (heredado)
     * @param DNI atributo DNI (heredado)
     * @param edad atributo edad (heredado)
     */
    public Adulto(String NSS, String direccion, String nombre, String DNI, int edad){
        super(nombre, DNI, edad);
        this.NSS=NSS;
        this.direccion=direccion;
    }

    /**
     * Constructor vacio de Adulto
     */
    public Adulto(){

    }

    /**
     * Metodo toString. Devuelve la información de la clase superior y sus atributos
     * @return Clase del objeto y sus atributos
     */
    @Override
    public String toString() {
        return "Adulto{" +
                "NSS= " + NSS + '\n' +
                ", direccion= " + direccion + '\n' +
                "nombre= " + getNombre() +  '\n' +
                "DNI= " + getDNI() + '\n' +
                "edad= " + getEdad() + '\n' +
                '}';
    }

    /**
     * Actualiza el valor del atributo direccion
     * @param direccion: nuevo valor de direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Actualiza el valor del atributo NSS
     * @param NSS: nuevo valor de NSS
     */
    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    /**
     * Metodo getDirección. Devuelve el valor del atributo Direccion
     * @return Direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo getNSS. Devuelve el valor del atributo NSS
     * @return NSS
     */
    public String getNSS() {
        return NSS;
    }
}

