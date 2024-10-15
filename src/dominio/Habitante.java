package dominio;
import java.io.Serializable;

/**
 * Clase que representa a un habitante.
 * Implementa la interfaz Serializable.
 */
public class Habitante implements Serializable {
    private String nombre;
    private String apellido1;
    private String apellido2;

    /**
     * Constructor de la clase Habitante.
     * @param nombre Nombre del habitante.
     * @param apellido1 Primer apellido del habitante.
     * @param apellido2 Segundo apellido del habitante.
     */
    public Habitante(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    /**
     * Establece el nombre del habitante.
     * @param nombre Nombre del habitante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el primer apellido del habitante.
     * @param apellido1 Primer apellido del habitante.
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Establece el segundo apellido del habitante.
     * @param apellido2 Segundo apellido del habitante.
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Obtiene el nombre del habitante.
     * @return Nombre del habitante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el primer apellido del habitante.
     * @return Primer apellido del habitante.
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Obtiene el segundo apellido del habitante.
     * @return Segundo apellido del habitante.
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Devuelve una representación en cadena del habitante.
     * @return Cadena con el primer apellido, segundo apellido y nombre del habitante.
     */
    @Override
    public String toString() {
        return apellido1 + " " + apellido2 + ", " + nombre;
    }
}
