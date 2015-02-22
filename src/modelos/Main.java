/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.io.IOException;

/**
 *
 * @author afilgueira
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArchivosObjetos ar = new ArchivosObjetos();
        ar.crearArchivo("src/citas/ejemplo3.obj");
        Persona p = new Persona("Anthony","Filgueira",11,"M");
        ar.escribrirArchivo("src/citas/ejemplo3.obj",p);
        ar.leerArchivo("src/citas/ejemplo3.obj");
    }
    
}
