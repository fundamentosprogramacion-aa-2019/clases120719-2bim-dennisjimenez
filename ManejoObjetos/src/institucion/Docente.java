/*
 *
 */
package institucion;

/**
 *
 * @author Salas
 */
public class Docente {

    private String nombre;
    private int anioExperiencia;
    private int edad;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void estableceranioExperiencia(int ex) {
        anioExperiencia = ex;
    }

    public int obtenerAnioExperiencia() {
        return anioExperiencia;
    }

    public void establecerEdad(int ed) {
        edad = ed;
    }

    public int obtenerEdad() {
        return edad;
    }
}
