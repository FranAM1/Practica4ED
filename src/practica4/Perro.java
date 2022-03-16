package practica4;

public class Perro extends Animal {
    private String raza;

    /**
     * Constructor vacio
     */
    public Perro(){}

    /**
     * Metodo completo
     *
     * @param nombre: nuevo valor del atributo nombre
     * @param edad: nuevo valor del atributo edad
     * @param raza: nuevo valor del atributo raza
     */
    public Perro(String nombre, int edad, String raza){
        super(nombre,edad);
        this.raza = raza;
    }

    /**
     * Metodo toString. Devuelve la informacion de la clase a la que pertenece y los atributos
     *
     * @return Clase del objetos y sus atributos en formato String.
     */
    @Override
    public String toString() {
        return "Perro{\n" +
                "nombre= " + getNombre() + '\n' +
                "edad= " + getEdad() + '\n' +
                "raza= " + raza + '\n' +
                '}';
    }

    /**
     * Metodo sonido. Muestra por consola el sonido del animal
     */
    public void sonido(){
        System.out.println("guau gau");
    }

    /**
     * Metodo getRaza. Devuelve el valor del atributo raza
     *
     * @return atributo raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Metodo setRaza. Actualiza el valor del atributo raza
     *
     * @param raza: nuevo valor del atributo raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
}
