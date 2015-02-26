/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controladores;

import javax.swing.JOptionPane;
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
    
}
