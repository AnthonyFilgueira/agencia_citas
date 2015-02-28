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
import modelos.Persona;
import modelos.Utilidades;
import vistas.VistaAdmin;
import vistas.VistaCliente;




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
        Utilidades ut = new Utilidades();
        if(Busqueda.buscarUsuario(rutaArchivo, cedula)){
        
            JOptionPane.showMessageDialog(null,"El Usuario ya Existe Ingresa Una Cedula Valida");
        }else{
            ut.crearCliente(rutaArchivo, cedula, nombre, apellido, edad, sexo, contextura, estatura, colorPiel, colorOjos, password, tipo, casado);
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
    }
