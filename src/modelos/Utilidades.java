/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author afilgueira
 */
public class Utilidades {
    
    public static ArrayList<Persona> actualizarPersona(Persona persona){
        ArrayList<Persona> listado = new ArrayList<Persona>();
        ArrayList<Persona> listado2 = new ArrayList<Persona>();
        ArrayList<Persona> listado3 = new ArrayList<Persona>();
        try {
            ArchivosObjetos ao = new ArchivosObjetos();
            Busqueda bs = new Busqueda();
            //Crea lista de personas existentes en el archivo
            listado = (ArrayList<Persona>) ao.leerArchivo("src/clientes/clientes.obj");
            //elimina el archivo y crea uno nuevo
            ao.sobreescribirArchivo("src/clientes/clientes.obj");
            //Carga la lista anterior busca y actualiza los atributos de la persona enviada por parametro
            listado2 = bs.actualizarPersona(listado, persona); 
            //se recorre la lista nueva con la persona actualizada y se guardan todas las personas en el nuevo archivo
            for(Persona objeto: listado2){
                ao.escribrirArchivo("src/clientes/clientes.obj",objeto);
            }
            //se Carga el archivo con los nuevos registros
            listado3 = (ArrayList<Persona>) ao.leerArchivo("src/clientes/clientes.obj");
             
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return listado3;
    }
  
    public static void imprimirListaPersonas(){
        ArchivosObjetos ao = new ArchivosObjetos();
        
        try {
           ArrayList<Persona> lista = (ArrayList<Persona>) ao.leerArchivo("src/clientes/clientes.obj");
           Iterator<Persona> e = lista.iterator();
               while( e.hasNext() ){
                   Persona aux = e.next();
                   System.out.println("*********Inicio**********");
                   System.out.println("Cedula:"+aux.getCedula());
                   System.out.println("Nombre:"+aux.getNombre());
                   System.out.println("Apellido:"+aux.getApellido());
                   System.out.println("Edad:"+aux.getEdad());
                   System.out.println("Sexo:"+aux.getSexo());
                   System.out.println("Contextura:"+aux.getContextura());
                   System.out.println("Estatura:"+aux.getEstatura());
                   System.out.println("Piel:"+aux.getColorPiel());
                   System.out.println("Ojos:"+aux.getColorOjos());
                   System.out.println("***********Fin************");
               }
           
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    
    }
    public static void imprimirListaPersonas(ArrayList<Persona> lista){
        
        Iterator<Persona> e = lista.iterator();
        while( e.hasNext() ){
            Persona aux = e.next();
            System.out.println("*********Inicio**********");
            System.out.println("Cedula:"+aux.getCedula());
            System.out.println("Nombre:"+aux.getNombre());
            System.out.println("Apellido:"+aux.getApellido());
            System.out.println("Sexo:"+aux.getSexo());
            System.out.println("Edad:"+aux.getEdad());
            System.out.println("Contextura:"+aux.getContextura());
            System.out.println("Estatura:"+aux.getEstatura());
            System.out.println("Piel:"+aux.getColorPiel());
            System.out.println("Ojos:"+aux.getColorOjos());
            System.out.println("***********Fin************");
        }
        
    
    }
    
    public static void crearCita(String rutaArchivo,Persona hombre, Persona mujer, String lugar,String fecha){
        ArchivosObjetos  ar = new ArchivosObjetos();
        
        Cita cita = new Cita(hombre,mujer,lugar,fecha);
        
        ar.escribrirArchivo(rutaArchivo, cita);
    }
    
}
