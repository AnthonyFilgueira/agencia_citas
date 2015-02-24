/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author afilgueira
 */
public class ArchivosObjetos<E> {
    
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
    public ArrayList<Persona> leerArchivoPersona(String ruta) throws IOException{
        
        FileInputStream f = new FileInputStream(ruta); 
        ArrayList<Persona> person = new ArrayList<Persona>();
        try {               
              while (f.available() > 0){
                  ObjectInputStream ois = new ObjectInputStream(f); 
                  Persona p  = (Persona) ois.readObject();
                  person.add(p);
              }              
        } catch (Exception ex) {
            System.out.println(ex);
        }
       f.close();
       
       return person;
    }
     public ArrayList<Cita> leerArchivoCita(String ruta) throws IOException{
        
        FileInputStream f2 = new FileInputStream(ruta); 
        ArrayList<Cita> citas = new ArrayList<Cita>();
        try {               
              while (f2.available() > 0){
                  ObjectInputStream ois = new ObjectInputStream(f2); 
                  Cita cita  = (Cita) ois.readObject();
                  citas.add(cita);
              }              
        } catch (Exception ex) {
            System.out.println(ex);
        }
       f2.close();
       
       return citas;
    }
     
    public <E> ArrayList<E> leerArchivo(String ruta) throws IOException{
        
        FileInputStream f3 = new FileInputStream(ruta); 
        ArrayList<E> elementos   =   new ArrayList<>();
       
        try {               
              while (f3.available() > 0){
                  ObjectInputStream ois = new ObjectInputStream(f3); 
                  E elemento  = (E) ois.readObject();
                  elementos.add(elemento);
                 
              } 
              
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }finally{
          
            f3.close();
        }
       
       
       return elementos;
    }
    
}
