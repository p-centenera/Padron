package dominio;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que representa la oficina del padrón de habitantes.
 * Implementa la interfaz Serializable.
 */
public class OficinaPadron implements Serializable {
    private ArrayList<Habitante> habitantesPadron = new ArrayList<>();

    /**
     * Añade un habitante al padrón.
     * @param habitante Habitante a añadir.
     */
    public void annadir(Habitante habitante) {
        habitantesPadron.add(habitante);
    }

    /**
     * Obtiene la lista de habitantes del padrón.
     * @return Lista de habitantes.
     */
    public ArrayList<Habitante> getHabitantesPadron() {
        return habitantesPadron;
    }

    /**
     * Calcula el número total de habitantes en el padrón.
     * @return Número total de habitantes.
     */
    public int calcularNumeroHabitantes() {
        return habitantesPadron.size();
    }

    /**
     * Devuelve una representación en cadena del padrón de habitantes.
     * @return Cadena con la lista de habitantes y el número total de habitantes.
     */
    @Override
    public String toString() {
        StringBuilder cad = new StringBuilder();
        for (Habitante h : habitantesPadron) {
            cad.append(h).append("\n");
        }
        cad.append("Total de habitantes: ").append(calcularNumeroHabitantes()).append("\n");
        return cad.toString();
    }
}
