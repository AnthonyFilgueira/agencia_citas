/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class Busqueda {
    
    public void Busqueda(){}
    
    
    public ArrayList<Persona> buscarPersona(ArrayList<Persona> list, Persona elem, int opc){
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
      public static ArrayList<Persona> buscarPersonas(String rutaArchivo, Persona elem){
        ArrayList<Persona> out = null;
          try {
            ArchivosObjetos ao = new ArchivosObjetos();
            
            ArrayList<Persona> list = ao.leerArchivo(rutaArchivo);
            
             out = new ArrayList<Persona>();
            
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
           
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return out;
    }
       public ArrayList<Persona> actualizarPersona(ArrayList<Persona> list, Persona elem){
       ArrayList<Persona> out = new ArrayList<Persona>();
        Iterator<Persona> e = list.iterator();
        while( e.hasNext() ){
            Persona aux = e.next();
            
                    if (aux.getCedula()==elem.getCedula()) {
                        
                        aux.setEdad(elem.getEdad());
                        aux.setContextura(elem.getContextura());
                        aux.setEstatura(elem.getEstatura());
                        aux.setPassword(elem.getPassword());
                        
                        out.add(aux);
                    }else{
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
    
      public static boolean buscarUsuario(String rutaArchivo,int cedula){
          ArchivosObjetos ao = new ArchivosObjetos();
          Persona persona= new Persona(cedula,"","",0,"","",0,"","","","",false); 
          boolean encontrado = false;
          
            ArrayList<Persona> list = null;
        try {
            list = ao.leerArchivo(rutaArchivo);
        } catch (IOException ex) {
            System.out.println(ex);
        }
            
            Iterator<Persona> e = list.iterator();
            
            while( e.hasNext() ){
                Persona aux = e.next();
                    
                    if (aux.getCedula()==persona.getCedula()) {  
                       encontrado = true;
                       break;
                    }else{
                        encontrado = false;
                        
                    }
             }
      
        return encontrado;
      }
      public static boolean buscarUsuario(String rutaArchivo,int cedula,String password){
          ArchivosObjetos ao = new ArchivosObjetos();
          Persona persona= new Persona(cedula,"","",0,"","",0,"","",password,"",false); 
          boolean encontrado = false;
          
            ArrayList<Persona> list = null;
        try {
            list = ao.leerArchivo(rutaArchivo);
        } catch (IOException ex) {
            System.out.println(ex);
        }
            
            Iterator<Persona> e = list.iterator();
            
            while( e.hasNext() ){
                Persona aux = e.next();
                    
                    if (aux.getCedula()==persona.getCedula() && aux.getPassword().toLowerCase().contentEquals(persona.getPassword().toLowerCase())) {  
                       encontrado = true;
                       break;
                    }else{
                        encontrado = false;
                        
                    }
             }
      
        return encontrado;
      }
      public static Persona getPersona(String rutaArchivo,int cedula){
            
          Persona persona = new Persona(cedula,"","",0,"","",0,"","","","",false); 
            
            ArrayList<Persona> list = Utilidades.getListaPersonas(rutaArchivo);
            
            Iterator<Persona> e = list.iterator();
            
            while( e.hasNext() ){
                Persona aux = e.next();
                    
                    if (aux.getCedula()==persona.getCedula()) {  
                       return aux;
                       
                    }
                    else{
                    
                    }
                    
             }
            return persona;
    
      }
}
