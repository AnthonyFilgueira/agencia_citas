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
public class Cita implements Serializable {
    
    private Persona hombre;
    private Persona mujer;
    private String lugar;
    private String fecha;
    
    public Cita(Persona hombre, Persona mujer,String lugar,String fecha ){
        
        this.hombre = hombre;
        this.mujer  = mujer;
        this.lugar  = lugar;
        this.fecha  = fecha;
    
    }

    /**
     * @return the hombre
     */
    public Persona getHombre() {
        return hombre;
    }

    /**
     * @return the mujer
     */
    public Persona getMujer() {
        return mujer;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }
    
    
}
