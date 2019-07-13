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
public class Ciclo {
    
    private String nombre;
    private int numero_alumnos;
    
   public void establecerNombre(String n){
    nombre = n;
   }
   
   public String obtenerNombre(){
       return nombre;
   }
   
   public void establecerNumero_Alumnos(int a){
    numero_alumnos = a;
   }
   
   public int obtenerNumero_Alumnos(){
       return numero_alumnos;
   }

  
    
}
