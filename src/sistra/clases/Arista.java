/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.clases;

import java.io.Serializable;


public class Arista<T> implements Serializable{

    private T sucesor;
    private int costo;
    private Object ob;

    public Object getOb() {
        return ob;
    }

    public void setOb(Object ob) {
        this.ob = ob;
    }

    public Arista(T sucesor, int costo, Object ob) {
        this.sucesor = sucesor;
        this.costo = costo;
        this.ob = ob;
    }

    /**
     * @return the sucesores
     */
    public T getSucesor() {
        return sucesor;
    }

    /**
     * @param sucesores the sucesores to set
     */
    public void setSucesor(T sucesores) {
        this.sucesor = sucesores;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }
}
