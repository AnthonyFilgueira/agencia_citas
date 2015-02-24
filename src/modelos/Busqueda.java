/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 
 */
public class Busqueda {
    
    public void Busqueda(){}
    
    
    public ArrayList<Persona> buscarPersonas(ArrayList<Persona> list, Persona elem, int opc){
       ArrayList<Persona> out = new ArrayList<Persona>();
        Iterator<Persona> e = list.iterator();
        while( e.hasNext() ){
            Persona aux = e.next();
            switch(opc){
                case 1:  // Buscar por nombre
                    if (aux.getNombre().toLowerCase().contentEquals(elem.getNombre().toLowerCase())) {
                        out.add(aux);
                    }
                    break;
                default: break;
            }
        }
       return out; 
    }
      public ArrayList<Persona> buscarPersonas2(ArrayList<Persona> list, Persona elem){
       ArrayList<Persona> out = new ArrayList<Persona>();
        Iterator<Persona> e = list.iterator();
        while( e.hasNext() ){
            Persona aux = e.next();
            
                    if (aux.getNombre().toLowerCase().contentEquals(elem.getNombre().toLowerCase())|| 
                            aux.getApellido().toLowerCase().contentEquals(elem.getApellido().toLowerCase())||
                            aux.getEdad()==elem.getEdad()||
                            aux.getSexo().toLowerCase().contentEquals(elem.getSexo().toLowerCase())) {
                        
                        out.add(aux);
                    }
        }
       return out; 
    }
      public ArrayList<Cita> buscarCita(ArrayList<Cita> list, Cita elem){
       ArrayList<Cita> out = new ArrayList<Cita>();
        Iterator<Cita> e = list.iterator();
        while( e.hasNext() ){
            Cita aux = e.next();
            
                    if (aux.getFecha().toLowerCase().contentEquals(elem.getFecha().toLowerCase())) {
                        
                        out.add(aux);
                    }
        }
       return out; 
    }
}
