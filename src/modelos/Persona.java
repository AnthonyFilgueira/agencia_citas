/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.io.Serializable;

/**
 *
 * @author afilgueira
 */
public class Persona implements Serializable{
    
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    
    public Persona(String nombre,String apellido,int edad,String sexo){
       
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }
    
    
}
