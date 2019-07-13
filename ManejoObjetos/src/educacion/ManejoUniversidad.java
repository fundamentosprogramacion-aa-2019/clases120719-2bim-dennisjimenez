/*
 *
 */
package educacion;

/**
 *
 * @author Salas
 */
public class ManejoUniversidad {
    
    public static void main(String[] args) {
        Universidad un = new Universidad();
        Carrera computacion = new Carrera();
        Carrera electronica = new Carrera();
        Carrera quimica = new Carrera();
        
        Ciclo []  listaCiclos1 = new Ciclo[2];
        Ciclo []  listaCiclos2 = new Ciclo[2];
        Ciclo []  listaCiclos3 = new Ciclo[2];
        
        Carrera [] listaCarreras = new Carrera[3];
        
        Ciclo c1 = new Ciclo();
        Ciclo c2 = new Ciclo();
        Ciclo c3 = new Ciclo();
        Ciclo c4 = new Ciclo();
        Ciclo c5 = new Ciclo();
        Ciclo c6 = new Ciclo();
        
        c1.establecerNombre("Primer Ciclo Computación");
        c1.establecerNumero_Alumnos(20);
        c2.establecerNombre("Segundo Ciclo Computación");
        c2.establecerNumero_Alumnos(25);
        
        c3.establecerNombre("Primer Ciclo electrónica");
        c3.establecerNumero_Alumnos(10);
        c4.establecerNombre("Segundo Ciclo electrónica");
        c4.establecerNumero_Alumnos(15);
        
        c5.establecerNombre("Primer Ciclo Química");
        c5.establecerNumero_Alumnos(10);
        c6.establecerNombre("Segundo Ciclo Química");
        c6.establecerNumero_Alumnos(20);
        
        listaCiclos1[0] = c1;
        listaCiclos1[1] = c2;
        
        listaCiclos2[0] = c3;
        listaCiclos2[1] = c4;
        
        listaCiclos3[0] = c5;
        listaCiclos3[1] = c6;
        
        computacion.establecerNombre("Ciencias de la Computación");
        computacion.establecerListaCiclos(listaCiclos1);
        
        electronica.establecerNombre("Electrónica");
        electronica.establecerListaCiclos(listaCiclos2);
        
        quimica.establecerNombre("Química");
        quimica.establecerListaCiclos(listaCiclos3);
        
        listaCarreras[0] = computacion;
        listaCarreras[1] = electronica;
        listaCarreras[2] = quimica;
        
        un.establecerNombre("UTPL");
        un.establecerListaCarreras(listaCarreras);
        un.establecerAlumnosUniversidad(100);
        
        String reporte = "";
        reporte = String.format("Universidad: %s\n", un.obtenerNombre());
        for (int i = 0; i < un.obtenerListaCarreras().length; i++) {
            reporte = String.format("%s\tCarrera: %s\n", reporte, 
                    un.obtenerListaCarreras()[i].obtenerNombre()); 
                    
            for (int j = 0; j < un.obtenerListaCarreras()[i].obtenerListaCiclos().length; j++) {
                reporte = String.format("%s\t\tCiclo: %s\n", reporte,
                        un.obtenerListaCarreras()[i].obtenerListaCiclos()[j].obtenerNombre());
            }
            
           
        }
        reporte = String.format("%sNúmero Alumnos de la Universidad : %s\n", reporte, un.obtenerAlumnosUniversidad());
        System.out.println(reporte);
        
    }
    
}
