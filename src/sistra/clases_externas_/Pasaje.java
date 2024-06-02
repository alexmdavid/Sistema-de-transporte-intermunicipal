/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.clases_externas_;

import java.io.Serializable;
import sistra.clases.Municipio;


public class Pasaje implements Serializable{
    private Municipio incio;
    private Municipio llegada;
    private int distancia;
    private float valor_por_km;
    private Bus bus;
    private String asiento;

    public Pasaje(Municipio incio, Municipio llegada, int distancia, Bus bus, String asiento) {
        this.incio = incio;
        this.llegada = llegada;
        this.distancia = distancia;
        this.valor_por_km = 2000;
        this.bus = bus;
        this.asiento = asiento;
    }

    public Float costo_pasaje(){
        return (float) distancia * valor_por_km;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "incio=" + incio + ", llegada=" + llegada + ", distancia=" + distancia + ", valor_por_km=" + valor_por_km + ", bus=" + bus + ", asiento=" + asiento + '}';
    }
    
    

    /**
     * @return the incio
     */
    public Municipio getIncio() {
        return incio;
    }

    /**
     * @param incio the incio to set
     */
    public void setIncio(Municipio incio) {
        this.incio = incio;
    }

    /**
     * @return the llegada
     */
    public Municipio getLlegada() {
        return llegada;
    }

    /**
     * @param llegada the llegada to set
     */
    public void setLlegada(Municipio llegada) {
        this.llegada = llegada;
    }

    /**
     * @return the distancia
     */
    public int getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the valor_por_km
     */
    public float getValor_por_km() {
        return valor_por_km;
    }

    /**
     * @param valor_por_km the valor_por_km to set
     */
    public void setValor_por_km(float valor_por_km) {
        this.valor_por_km = valor_por_km;
    }

    /**
     * @return the bus
     */
    public Bus getBus() {
        return bus;
    }

    /**
     * @param bus the bus to set
     */
    public void setBus(Bus bus) {
        this.bus = bus;
    }

    /**
     * @return the asiento
     */
    public String getAsiento() {
        return asiento;
    }

    /**
     * @param asiento the asiento to set
     */
    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    
    
}
