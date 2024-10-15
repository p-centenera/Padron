package aplicacion;
import presentacion.InterfazUsuario;

/**
 * Clase principal que inicia la aplicación.
 */
public class Principal {
    /**
     * Método principal que inicia la ejecución de la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        String[] instr;
        boolean continuar;
        InterfazUsuario iu = new InterfazUsuario();
        do {
            instr = iu.leerInstruccion();
            continuar = iu.ejecutar(instr);
        } while (continuar);
    }
}

