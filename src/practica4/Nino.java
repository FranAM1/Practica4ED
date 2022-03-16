package practica4;

public class Nino extends Persona{
    private String colegio;
    private Juguete juguete;

    /**
     * Constructor completo de Niño
     * @param colegio atributo colegio
     * @param nombre atributo nombre (heredado)
     * @param DNI atributo DNI (heredado)
     * @param edad atributo edad (heredado)
     */
    public Nino(String colegio, String nombre, String DNI, int edad){
        super(nombre, DNI, edad);
        this.colegio = colegio;


    }

    /**
     * Constructor vacío de Niño
     */
    public Nino(){

    }

    /**
     * Metodo toString. Devuelve la información de la clase superior y sus atributos
     * @return Clase del objeto y sus atributos
     */
    @Override
    public String toString() {
        return "Nino{\n" +
                "colegio= " + colegio + '\n' +
                ", juguete= " + juguete + '\n' +
                "nombre= " + getNombre() +  '\n' +
                "DNI= " + getDNI() + '\n' +
                "edad= " + getEdad() + '\n' +
                '}';
    }

    /**
     * Actualiza el valor del atributo colegio
     * @param colegio: nuevo valor de colegio
     */
    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    /**
     * Metodo getColegio. Devuelve el valor del atributo colegio
     * @return colegio
     */
    public String getColegio() {
        return colegio;
    }

    /**
     * Metodo comprarJuguete. Agregación de un objeto juguete a un objeto de la clase niño
     * @param juguete: nuevo valor de juguete
     */
    public void comprarJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    /**
     * Metodo getJuguete. Devuelve el valor del atributo Juguete
     * @return Juguete
     */
    public Juguete getJuguete() {
        return juguete;
    }
}
