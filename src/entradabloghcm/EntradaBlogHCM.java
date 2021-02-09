package entradabloghcm;

/**
 * Clase para manejar las entradas de un blog.
 * @author Héctor Cano Maestre
 * @since 08.02.2021
 * @version 2.3
 */
public class EntradaBlogHCM {


    /**
     * Es el caracter que separa ENTRADA DE del nombre del autor
     */
    public static char separador = ':';
    private int id;
    private String texto;
    private String autor;

    /**
     * Constructor de la clase.
     * @param id int número de entrada
     * @param autor String nombre del autor de la entrada
     * @param texto String texto que contiene la entrada
     * @throws IllegalArgumentException si el número de entrada es negativo
     */
    public EntradaBlogHCM(int id, String autor, String texto) throws IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("El id no puede ser negativo");
        }
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    /**
     * Este método devuelve la cadena a imprimir de una entrada del blog
     * @return cad String 
     */
    @Override
    public String toString() {
        String cad = "";
        cad += "\nENTRADA DE" + separador + autor;
        cad += "\n " + texto;
        return cad;
    }

    /**
     * Método que evuelve el número de la entrada.
     * @return id int identificador de la entrada.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Método que devuelve el texto completo de la entrada.
     * @return texto String texto completo de la entrada
     */
    public String getTexto() {
        return this.texto;
    }

    /**
     * Método que devuelve el nombre del autor de la entrada en mayúsculas.
     * @return autor String nombre del autor
     */
    public String getAutor() {
        return this.autor.toUpperCase();
    }

    /**
     * Método que devuelve el nombre del autor.
     * @deprecated Ya no se usa. Mejor ver {@link #getAutor()}
     * @return autor String nombre del autor.
     */
    public String devuelveAutor() {
        return this.autor;
    }

    /**
     * Método principal del programa.
     */
    public static void main(String[] args) {
        //Modificar.
        EntradaBlogHCM e1 = new EntradaBlogHCM(3, "ana", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}
