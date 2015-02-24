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
        
        //Bloque para Crear Clientes
            //       ar.crearArchivo("src/clientes/clientes.obj");
            //        Persona p = new Persona("jose","blanca",12,"M");
            //       Persona p2 = new Persona("maria","soute",13,"F");
            //        Persona p3 = new Persona("josefina","perez",12,"F");
            //       ar.escribrirArchivo("src/clientes/clientes.obj",p);
            //      ar.escribrirArchivo("src/clientes/clientes.obj",p2);
            //      ar.escribrirArchivo("src/clientes/clientes.obj",p3); 
        //Fin Bloque Crear Clientes
        
        //Bloque para Crear Citas
//                   ar.crearArchivo("src/citas/citas.obj");
//                    Persona p = new Persona("anthony","filgueira",26,"M");
//                   Persona p2 = new Persona("mayerling","aristimuno",25,"F");
//                    Cita cita = new Cita(p,p2,"orinokia","26/02/2015");
//                   ar.escribrirArchivo("src/citas/citas.obj",cita);
            //      ar.escribrirArchivo("src/clientes/clientes.obj",p2);
            //      ar.escribrirArchivo("src/clientes/clientes.obj",p3); 
        //Fin Bloque Crear Citas
        
       
       Busqueda bs = new Busqueda();
       
//       System.out.println("Iterando afuera con el  Vector");
//       
//       ArrayList<Persona> listado = new ArrayList<Persona>();
       // Listado sin filtro
       //listado = (ArrayList<Persona>) ar.leerArchivo("src/citas/ejemplo3.obj").clone();
       
// Listado de Personas con filtro
        //       listado =  (ArrayList<Persona>) bs.buscarPersonas2(ar.leerArchivoPersona("src/clientes/ejemplo3.obj"), new Persona("","",0,"F"));
        //       
        //      Iterator<Persona> e = listado.iterator();
        //       while( e.hasNext() ){
        //           Persona aux = e.next();
        //           System.out.println("Nombre:"+aux.getNombre());
        //           System.out.println("Apellido:"+aux.getApellido());
        //           System.out.println("Sexo:"+aux.getSexo());
        //           System.out.println("Edad:"+aux.getEdad());
        //       }
        //    }
//Fin listado Personas
//Listado de Citas
        ArrayList<Cita> listado = new ArrayList<Cita>();
           listado =  (ArrayList<Cita>) bs.buscarCita(ar.leerArchivoCita("src/citas/citas.obj"), new Cita(null,null,"","26/02/2015"));
               
              Iterator<Cita> e = listado.iterator();
               while( e.hasNext() ){
                   Cita aux = e.next();
                   System.out.println("*******Cita********");
                   System.out.println("Pareja 1\n"+aux.getHombre());
                   System.out.println("Pareja 2\n"+aux.getMujer());
                   System.out.println("Lugar:"+aux.getLugar());
                   System.out.println("Fecha:"+aux.getFecha());
                   System.out.println("*******Fin********");
               }
            }    
    
//Fin listado de Citas
}
