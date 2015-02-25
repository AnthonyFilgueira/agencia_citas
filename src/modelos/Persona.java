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
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String contextura;
    private float estatura;
    private String colorPiel;
    private String colorOjos;
    private String password;
    
    public Persona(int cedula,String nombre,String apellido,int edad,String sexo,String contextura,float estatura, String colorPiel,String colorOjos,String password){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.contextura = contextura;
        this.estatura = estatura;
        this.colorPiel = colorPiel;
        this.colorOjos = colorOjos;
        this.password = password;
        
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
    
    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }
    

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    @Override
    public String toString(){
    
    return "Cedula: "+this.getCedula()+"\nNombre: "+this.getNombre()+"\nApellido: "+this.getApellido()+"\nEdad: "+this.getEdad()+"\nSexo: "+this.getSexo()+"\nContextura: "+this.getContextura()+"\nEstatura: "+this.getEstatura()+"\nPiel: "+this.getColorPiel()+"\nOjos: "+this.getColorOjos()+"\nPassword: "+this.getPassword();
    }

    /**
     * @return the contextura
     */
    public String getContextura() {
        return contextura;
    }

    /**
     * @param contextura the contextura to set
     */
    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    /**
     * @return the estatura
     */
    public float getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the colorPiel
     */
    public String getColorPiel() {
        return colorPiel;
    }

    /**
     * @param colorPiel the colorPiel to set
     */
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    /**
     * @return the colorOjos
     */
    public String getColorOjos() {
        return colorOjos;
    }

    /**
     * @param colorOjos the colorOjos to set
     */
    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
