/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author afilgueira
 */
public class Archivos {
    
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
     
    public void escribrirArchivo(String ruta,String message){
          try {
              
              FileWriter fw = new FileWriter(ruta,true);
              BufferedWriter bw = new BufferedWriter(fw);
              bw.write(message);
              bw.newLine();
              bw.close();
              fw.close();
          } catch (Exception ex) {
              System.out.println(""+ex);
          }
    
    }
    public void leerArchivo(String ruta){
        try {
           FileReader  fr = new FileReader(ruta);
             BufferedReader br = new BufferedReader(fr);
            
            System.out.println(""+br.readLine());
             br.close();
             fr.close();
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }
}
