/*
 *
 */
package institucion;

/**
 *
 * @author Salas
 */
public class Paralelo {

    private String nombre;
    private Asignatura[] listaAsignaturas;
    private double creditosParalelo;

    public void establecerCreditosParalelo() {

        double suma = 0;
        for (int i = 0; i < listaAsignaturas.length; i++) {
            suma = suma + listaAsignaturas[i].obtenerCreditos();
        }
        creditosParalelo = suma;
    }

    public double obtenerCreditosParalelo() {
        return creditosParalelo;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerListaAsignaturas(Asignatura[] lista) {
        listaAsignaturas = lista;
    }

    public Asignatura[] obtenerListaAsignatura() {
        return listaAsignaturas;
    }
}
