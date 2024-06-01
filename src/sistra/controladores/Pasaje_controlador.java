/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.controladores;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import sistra.clases_externas_.Pasaje;


public class Pasaje_controlador implements Serializable{
    List<Pasaje> pasajes;

    public Pasaje_controlador() {
        pasajes = new LinkedList<>();
    }
    
    public void add_pasaje(Pasaje x){
        pasajes.add(x);
    }
    
}
