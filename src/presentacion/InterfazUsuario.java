package presentacion;
import dominio.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * Clase que representa la interfaz de usuario para interactuar con el padrón de habitantes.
 */
public class InterfazUsuario {
    private OficinaPadron padron;
    private Scanner sc = new Scanner(System.in);

    /**
     * Ejecuta una instrucción dada por el usuario.
     * @param instruccion Instrucción a ejecutar.
     * @return true si la ejecución debe continuar, false si debe terminar.
     */
    public boolean ejecutar(String[] instruccion) {
        if (instruccion.length == 1) {
            if (instruccion[0].equalsIgnoreCase("mostrar"))
                System.out.println(padron);
            else if (instruccion[0].equalsIgnoreCase("ayuda"))
                System.out.println("opciones: \n mostrar \n ayuda \n añadir <nombre> <apellido1> <apellido2> \n salir");
            else if (instruccion[0].equalsIgnoreCase("salir")) {
                try {
                    escribirPadron();
                    System.out.println("Finalizado con éxito");
                } catch (Exception e) {
                    System.out.println("Error al escribir fichero");
                }
                sc.close();
                return false;
            } else
                System.out.println("Error en la instrucción. Ayuda para más info");
        } else if (instruccion[0].equalsIgnoreCase("añadir") && instruccion.length == 4) {
            padron.annadir(new Habitante(instruccion[1], instruccion[2], instruccion[3]));
            System.out.println("Habitante añadido correctamente");
        } else {
            System.out.println("Error en la instrucción. Ayuda para más info");
        }
        return true;
    }

    /**
     * Lee una instrucción del usuario.
     * @return Array de cadenas con las palabras de la instrucción.
     */
    public String[] leerInstruccion() {
        System.out.print("?>");
        String linea = sc.nextLine();
        return linea.split(" ");
    }

    /**
     * Lee el padrón de habitantes desde un archivo.
     */
    private void leerPadron() {
        ObjectInputStream oi;
        try {
            oi = new ObjectInputStream(new FileInputStream("padron.dat"));
            padron = (OficinaPadron) oi.readObject();
        } catch (Exception e) {
            padron = new OficinaPadron();
        }
    }

    /**
     * Escribe el padrón de habitantes en un archivo.
     * @throws Exception Si ocurre un error durante la escritura.
     */
    private void escribirPadron() throws Exception {
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("padron.dat"));
        oo.writeObject(padron);
        oo.close();
    }

    /**
     * Constructor de la clase InterfazUsuario.
     * Inicializa el padrón leyendo desde un archivo.
     */
    public InterfazUsuario() {
        leerPadron();
    }
}


