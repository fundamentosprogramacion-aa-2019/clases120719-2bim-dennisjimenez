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
public class Universidad {
    
    private String nombre;
    private Carrera [] listaCarreras;
    private int AlumnosUniversidad;
    
   public void establecerNombre(String n){
    nombre = n;
   }
   
   public String obtenerNombre(){
       return nombre;
   }
   
   public void establecerListaCarreras(Carrera [] ca){
    listaCarreras = ca;
   }
   
   public Carrera[] obtenerListaCarreras(){
       return listaCarreras;
   }

    public void establecerAlumnosUniversidad(int n){      
        AlumnosUniversidad = n;
        
    }
    
    public int obtenerAlumnosUniversidad(){
        return AlumnosUniversidad;
    }

       
    
}
