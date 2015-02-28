/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.awt.Event;
import java.awt.event.KeyEvent;
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
                   System.out.println("Password:"+aux.getPassword());
                   System.out.println("Tipo:"+aux.getTipo());
                   System.out.println("Casado:"+aux.isCasado());
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
            System.out.println("Password:"+aux.getPassword());
            System.out.println("Tipo:"+aux.getTipo());
            System.out.println("Casado:"+aux.isCasado());
            System.out.println("***********Fin************");
        }
        
    
    }
    
    public static void crearCita(String rutaArchivo,Persona hombre, Persona mujer, String lugar,String fecha){
        ArchivosObjetos  ar = new ArchivosObjetos();
        
        Cita cita = new Cita(hombre,mujer,lugar,fecha);
        
        ar.escribrirArchivo(rutaArchivo, cita);
    }
    
    public static ArrayList<Persona> getListaPersonas(String rutaArchivo){
         ArchivosObjetos ao = new ArchivosObjetos();
        ArrayList<Persona> list = null;
        try {
            
            
           list = ao.leerArchivo(rutaArchivo); 
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    
        return list;
    }
     public static ArrayList<Cita> getListaCitas(String rutaArchivo){
         ArchivosObjetos ao = new ArchivosObjetos();
        ArrayList<Cita> list = null;
        try {
            
            
           list = ao.leerArchivo(rutaArchivo); 
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    
        return list;
    }
    
    public static void crearCliente(String rutaArchivo,int cedula,String nombre,String apellido,int edad,String sexo,String contextura,float estatura, String colorPiel,String colorOjos,String password,String tipo,boolean casado){
    
        Persona p = new Persona(cedula,nombre,apellido,edad,sexo,contextura,estatura,colorPiel,colorOjos,password,tipo,casado);
        
        ArchivosObjetos  ao = new ArchivosObjetos();
        
        ao.escribrirArchivo(rutaArchivo, p);
        
    
    }
    public static void validarNumeros(KeyEvent e,int opc){
        char c =e.getKeyChar();
        if(opc==1){
    
            if(c<'0'||c>'9'){
                e.consume();
            }}
        else if(opc==2){
            if((c<'0'||c>'9')&&(c!='.')){
                e.consume();
            
            }}
            
        
    }
    public static void validarLetras(KeyEvent e){
    
    char c =e.getKeyChar();
    
        if((c<'a'||c>'z') && ((c<'A'||c>'Z'))){
        e.consume();
        }
    
    }
    
}
