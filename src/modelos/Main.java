/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author afilgueira
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArchivosObjetos ar = new ArchivosObjetos();
        ar.crearArchivo("src/citas/ejemplo3.obj");
        //Persona p = new Persona("Anthony","Filgueira",11,"M");
        //ar.escribrirArchivo("src/citas/ejemplo3.obj",p); 
       
       Busqueda bs = new Busqueda();
       
       System.out.println("Iterando afuera con el  Vector");
       
       ArrayList<Persona> listado = new ArrayList<Persona>();
       // Listado sin filtro
       //listado = (ArrayList<Persona>) ar.leerArchivo("src/citas/ejemplo3.obj").clone();
       // Listado con filtro
       listado =  (ArrayList<Persona>) bs.buscarPersonas(ar.leerArchivo("src/citas/ejemplo3.obj"), new Persona("javier","",0,""), 1).clone();
       
      Iterator<Persona> e = listado.iterator();
       while( e.hasNext() ){
           Persona aux = e.next();
           System.out.println("Nombre:"+aux.getNombre());
           System.out.println("Apellido:"+aux.getApellido());
           System.out.println("Sexo:"+aux.getSexo());
           System.out.println("Edad:"+aux.getEdad());
       }
    }
    
}
