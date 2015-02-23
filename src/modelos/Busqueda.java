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
    
}
