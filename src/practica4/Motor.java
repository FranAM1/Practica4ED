package practica4;

public class Motor{
    private String fabricante;
    private String potencia;
    private int codigo;

    /**
     * Constructor vacio
     */
    public Motor(){

    }

    /**
     * Constructor completo
     *
     * @param fabricante: nuevo valor del atributo fabricante
     * @param potencia: nuevo valor del atributo potencia
     * @param codigo: nuevo valor del atributo codigo
     */
    public Motor(String fabricante, String potencia, int codigo) {
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.codigo = codigo;
    }

    /**
     * Metodo toString. Devuelve la informacion de la clase a la que pertenece y los atributos
     *
     * @return Clase del objetos y sus atributos en formato String.
     */
    @Override
    public String toString() {
        return "Motor{\n" +
                "fabricante= " + fabricante + '\n' +
                "potencia= " + potencia + '\n' +
                "codigo= " + codigo + '\n' +
                '}';
    }

    /**
     * Metodo getFabricante. Devuelve el valor del atributo fabricante
     *
     * @return atributo fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Metodo setFabricante. Actualiza el valor del artributo fabricante
     *
     * @param fabricante: nuevo valor del atributo fabricante
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Metodo getPotencia. Devuelve el valor del atributo potencia
     *
     * @return atributo potencia
     */
    public String getPotencia() {
        return potencia;
    }

    /**
     * Metodo setPotencia. Actualiza el valor del atributo potencia
     *
     * @param potencia: nuevo valor del atributo potencia
     */
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    /**
     * Metodo getCodigo. Devuelve el valor del atributo codigo
     *
     * @return atributo codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Metodo setCodigo. Actualiza el valor del atributo codigo
     *
     * @param codigo: nuevo valor del atributo codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
