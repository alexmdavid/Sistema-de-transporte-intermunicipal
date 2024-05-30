/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.controladores;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import sistra.clases_externas_.Bus;


/**
 *
 * @author ALEX DAVID RUIDIAZ C
 */
public class Bus_controlador implements Serializable {
    List<Bus> buses;

    public Bus_controlador() {
        buses = new LinkedList<>();
    }
    
    public void add_pasaje(Bus x){
        buses.add(x);
    }
    
}
