/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.controladores;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import sistra.clases_externas_.Bus;



public class Bus_controlador implements Serializable {
    private List<Bus> buses;

    public Bus_controlador() {
        buses = new LinkedList<>();
    }
    
    public String mostrar_buses(){
        String lis = "";
        for (Bus bus : getBuses()) {         
                lis+=bus.toString()+"\n";
        }
        return lis;
    }
    
    public String mostrar_buses_disponibles(){
        String lis = "";
        for (Bus bus : getBuses()) {
            if(bus.isDisponible()){
                lis+=bus.toString()+"\n";
            }
        }
        return lis;
    }
    
    public void add_bus(Bus x){
        getBuses().add(x);
    }

    /**
     * @return the buses
     */
    public List<Bus> getBuses() {
        return buses;
    }

    /**
     * @param buses the buses to set
     */
    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }
    
}
