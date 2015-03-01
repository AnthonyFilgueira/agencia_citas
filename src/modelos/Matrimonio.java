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
public class Matrimonio implements Serializable {
    
    private Persona pareja1;
    private Persona pareja2;
    
    public Matrimonio(Persona pareja1,Persona pareja2){
        this.pareja1 = pareja1;
        this.pareja2 = pareja2;
       
    }

    /**
     * @return the pareja1
     */
    public Persona getPareja1() {
        return pareja1;
    }

    /**
     * @param pareja1 the pareja1 to set
     */
    public void setPareja1(Persona pareja1) {
        this.pareja1 = pareja1;
    }

    /**
     * @return the pareja2
     */
    public Persona getPareja2() {
        return pareja2;
    }

    /**
     * @param pareja2 the pareja2 to set
     */
    public void setPareja2(Persona pareja2) {
        this.pareja2 = pareja2;
    }
    
}
