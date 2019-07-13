/*
 *
 */
package institucion;

/**
 *
 * @author Salas
 */
public class Asignatura {

    private String nombre;
    private String horario;
    private int creditos;
    private Docente docente;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerHorario(String h) {
        horario = h;
    }

    public String obtenerHorario() {
        return horario;
    }

    public void establecerCreditos(int c) {
        creditos = c;
    }

    public int obtenerCreditos() {
        return creditos;
    }

    public void establecerDocente(Docente d) {
        docente = d;
    }

    public Docente obtenerDocente() {
        return docente;
    }
}
