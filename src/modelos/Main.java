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
        ArchivosObjetos  ar = new ArchivosObjetos();
        
        
        //ArchivosObjetos  ar2 = new ArchivosObjetos();
        
        //Bloque para Crear Clientes
//                    ar.crearArchivo("src/clientes/clientes.obj");
//                    Persona p = new Persona(18828200,"anthony","filgueira",26,"M","flaco",194,"moreno","negros","123");
//                    Persona p2 = new Persona(8887392,"diany","mendez",13,"F","flaco",194,"moreno","negros","123");
//                    Persona p3 = new Persona(528551,"nidia","montano",12,"F","flaco",194,"moreno","negros","123");
//                    ar.escribrirArchivo("src/clientes/clientes.obj",p);
//                    ar.escribrirArchivo("src/clientes/clientes.obj",p2);
//                    ar.escribrirArchivo("src/clientes/clientes.obj",p3); 
        //Fin Bloque Crear Clientes
        
        //Bloque para Crear Citas
     
 //                  ar.crearArchivo("src/citas/citas.obj");
//                    Persona p = new Persona(18828200,"anthony","filgueira",26,"M");
 //                 Persona p2 = new Persona(20887600,"mayerling","aristimuno",25,"F");
//                     Utilidades.crearCita("src/citas/citas.obj", p, p2, "orinokia", "26/02/2015");
//                    Cita cita = new Cita(p,p2,"orinokia","26/02/2015");
//                  ar.escribrirArchivo("src/citas/citas.obj",cita);
 //                ar.escribrirArchivo("src/clientes/clientes.obj",p2);
//                  ar.escribrirArchivo("src/clientes/clientes.obj",p3); 
        //Fin Bloque Crear Citas
        
       
     Busqueda bs = new Busqueda();
       
//       System.out.println("Iterando afuera con el  Vector");
//  
        
//Creacion de lista de personas
 // ArrayList<Persona> listado = new ArrayList<Persona>();
  //ArrayList<Persona> listado2 = new ArrayList<Persona>();

// Listado General de Personas
//    Utilidades.imprimirListaPersonas();
     
//Actualizar Persona
    //    Utilidades.actualizarPersona(new Persona(18828200,"","",26,""));
    //    Utilidades.imprimirListaPersonas(); 
  
// Listado de Personas con Preferencias
//   listado =   bs.buscarPersonas("src/clientes/clientes.obj", new Persona(0,"","",0,"F"));
//   Utilidades.imprimirListaPersonas(listado);           

//Buscar Usuario
// if(Busqueda.buscarUsuario("src/clientes/clientes.obj", 528551)){
// 
//     System.out.println("encontrado");
// 
// }else{
//     System.out.println("no encontrado");
// }
 //Buscar login y password
// if(Busqueda.buscarUsuario("src/clientes/clientes.obj", 8887392,"12")){
// 
//     System.out.println("encontrado");
// 
// }else{
//     System.out.println("no encontrado");
// }
//     
//Listado de Citas Con Preferencias
//                        ArrayList<Cita> listado = new ArrayList<Cita>();
//                           listado =  bs.buscarCita(ar.leerArchivo("src/citas/citas.obj"), new Cita(null,null,"","26/02/2015"));
//                               
//                              Iterator<Cita> e = listado.iterator();
//                               while( e.hasNext() ){
//                                   Cita aux = e.next();
//                                   System.out.println("*******Cita********");
//                                   System.out.println("Pareja 1\n"+aux.getHombre());
//                                   System.out.println("Pareja 2\n"+aux.getMujer());
//                                   System.out.println("Lugar:"+aux.getLugar());
//                                   System.out.println("Fecha:"+aux.getFecha());
//                                   System.out.println("*******Fin********");
//                               }
//Fin listado de Citas
            
    }        

}
