/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controladores;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Busqueda;
import modelos.Cita;
import modelos.Persona;
import modelos.Utilidades;
import vistas.VistaAdmin;
import vistas.VistaCliente;
import vistas.VistaPrincipal;




/**
 *
 * @author afilgueira
 */
public class CtrPersona {
    
    public static boolean iniciarSesion(String rutaArchivo,int cedula, String password){
            Persona p;
            if(Busqueda.buscarUsuario(rutaArchivo,cedula,password)){
                 
                  
                  p= Busqueda.getPersona(rutaArchivo,cedula);                 
                  
                if(p.getTipo().contentEquals("admin")){
                    
                        VistaAdmin va = new VistaAdmin();
                        
                        va.setVisible(true);
                        return true;
                }else if(p.getTipo().contentEquals("cliente")){
                                        
                    VistaCliente vc = new VistaCliente();
            
                    vc.setVisible(true);
                    return true;
                }
                }else{
                    
                return false;
            }
            return false;
    }
    
    public static boolean crearCliente(String rutaArchivo,int cedula,String nombre,String apellido,int edad,String sexo,String contextura,float estatura, String colorPiel,String colorOjos,String password,String tipo,boolean casado){
       
        if(Busqueda.buscarUsuario(rutaArchivo, cedula)){
        
            JOptionPane.showMessageDialog(null,"El Usuario ya Existe Ingresa Una Cedula Valida");
        }else{
            Utilidades.crearCliente(rutaArchivo, cedula, nombre, apellido, edad, sexo, contextura, estatura, colorPiel, colorOjos, password, tipo, casado);
        return true;
        }
        return false;
    }
    
    public static void BuscarPersonas(JTable tabla,JPanel panel,String sexo,String contextura,int edad,float estatura,String piel,String ojos){
    DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("cedula");
            modelo.addColumn("nombre");
            modelo.addColumn("apellido");
            modelo.addColumn("edad");
            modelo.addColumn("sexo");
            modelo.addColumn("contextura");
            modelo.addColumn("estatura");
            modelo.addColumn("ojos");
            modelo.addColumn("piel");
            tabla.setVisible(true);
    ArrayList<Persona> listado = new ArrayList<Persona>();
    Persona p = new Persona(0,"","",edad,sexo,contextura,estatura,piel,ojos,"","",false);
    listado=Busqueda.buscarPersonas("src/clientes/clientes.obj", p);
    Object []object = new Object[9];
    Iterator<Persona> e = listado.iterator();
        while( e.hasNext() ){
            Persona aux = e.next();
            object[0] = aux.getCedula();
            object[1] = aux.getNombre(); 
            object[2] = aux.getApellido(); 
            object[3] = aux.getEdad();  
            object[4] = aux.getSexo();  
            object[5] = aux.getContextura(); 
            object[6] = aux.getEstatura(); 
            object[7] = aux.getColorOjos();  
            object[8] = aux.getColorPiel();
             
            modelo.addRow(object);        
        }
 
panel.setVisible(true);
tabla.setVisible(true);


}
   public static boolean crearCita(String rutaArchivoPersona,String rutaArchivoCita,int pareja,String lugar,String fecha){
   if(rutaArchivoPersona.isEmpty()|| rutaArchivoCita.isEmpty()||pareja==0||lugar.isEmpty()||fecha.isEmpty()){
   
       return false;
   } else{   
   Persona p1 = new Persona(0,"","",0,"","",0,"","","","",false);
   Persona p2 = new Persona(0,"","",0,"","",0,"","","","",false);
   
   p1 = Busqueda.getPersona(rutaArchivoPersona, VistaPrincipal.ced);
   
   
   p2 = Busqueda.getPersona(rutaArchivoPersona, pareja);
  
   
   Utilidades.crearCita(rutaArchivoCita, p1, p2, lugar, fecha);
   return true;
   }
   } 

   public static void listarCitasPersona(JTable tabla,JPanel panel,String rutaArchivoCitas){
   
    DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("Pareja");
            modelo.addColumn("Pareja");
            modelo.addColumn("Lugar");
            modelo.addColumn("Fecha");
            tabla.setVisible(true);
                    ArrayList<Cita> listado = new ArrayList<Cita>();
    
    listado= Utilidades.getListaCitas(rutaArchivoCitas);
    Object []object = new Object[4];
    Iterator<Cita> e = listado.iterator();
        while( e.hasNext() ){
            Cita aux = e.next();
            if(aux.getHombre().getCedula()==VistaPrincipal.ced||aux.getMujer().getCedula()==VistaPrincipal.ced){
            object[0] = aux.getHombre().getNombre();
            object[1] = aux.getMujer().getNombre(); 
            object[2] = aux.getLugar(); 
            object[3] = aux.getFecha();  
           
             
            modelo.addRow(object); 
            }
        }
 
panel.setVisible(true);
tabla.setVisible(true);
   }
      public static void listarCitasAdmin(JTable tabla,JPanel panel,String rutaArchivoCitas){
   
    DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("Pareja");
            modelo.addColumn("Pareja");
            modelo.addColumn("Lugar");
            modelo.addColumn("Fecha");
            tabla.setVisible(true);
                    ArrayList<Cita> listado = new ArrayList<Cita>();
    
    listado= Utilidades.getListaCitas(rutaArchivoCitas);
    Object []object = new Object[4];
    Iterator<Cita> e = listado.iterator();
        while( e.hasNext() ){
            Cita aux = e.next();
            
            object[0] = aux.getHombre().getNombre();
            object[1] = aux.getMujer().getNombre(); 
            object[2] = aux.getLugar(); 
            object[3] = aux.getFecha();  
           
             
            modelo.addRow(object); 
            
        }
 
panel.setVisible(true);
tabla.setVisible(true);
   }
      
      public static void actualizarPerfil(Persona persona){
      
      Utilidades.actualizarPersona(persona);
      }
}
