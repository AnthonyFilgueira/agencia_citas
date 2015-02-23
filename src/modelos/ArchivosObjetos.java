/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author afilgueira
 */
public class ArchivosObjetos {
    public void ArchivosObjetos(){
    }
    
   public void crearArchivo(String ruta){
        try {
        File f = new File(ruta);
        if(!f.exists()){
            f.createNewFile();
            JOptionPane.showMessageDialog(null, "Archivo Creado Correctamente");
        }else{
        JOptionPane.showMessageDialog(null, "Ya el Archivo Existe");
            
        }
            
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
        
    
    } 
   
   public void escribrirArchivo(String ruta,Object objeto){
          try {
              
              FileOutputStream fos = new FileOutputStream(ruta, true);
              ObjectOutputStream oos = new ObjectOutputStream(fos);
              oos.writeObject(objeto);
              oos.close();
              fos.close();
              
          } catch (Exception ex) {
              System.out.println(ex);
          }
    }
    public void leerArchivo(String ruta) throws IOException{
        
        FileInputStream f = new FileInputStream(ruta); 
        
        try {               
              while (f.available() > 0){
                  ObjectInputStream ois = new ObjectInputStream(f); 
                  Persona p  = (Persona) ois.readObject();
                   System.out.println("Nombre:"+p.getNombre());
                   System.out.println("Apellido:"+p.getApellido());
                   System.out.println("Sexo:"+p.getSexo());
                   System.out.println("Edad:"+p.getEdad());
              }              
        } catch (Exception ex) {
            System.out.println(ex);
        }
       f.close();
    }
    
    
}
