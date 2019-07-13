/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educacion;

/**
 *
 * @author Salas
 */
public class Carrera {
    
    private String nombre;
    private Ciclo [] listaCiclos;
    
   public void establecerNombre(String n){
    nombre = n;
   }
   
   public String obtenerNombre(){
       return nombre;
   }
   
   public void establecerListaCiclos(Ciclo[] ci){
    listaCiclos = ci;
   }
   
   public Ciclo [] obtenerListaCiclos(){
       return listaCiclos;
   }
    
}
