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
    private List<Pasaje> pasajes;

    public Pasaje_controlador() {
        pasajes = new LinkedList<>();
    }

    /**
     * @return the pasajes
     */
    public List<Pasaje> getPasajes() {
        return pasajes;
    }

    public String mostrar_pasajes(){
        String lis="";
        for (Pasaje pas : pasajes) {
            lis += pas.toString()+"\n";
        }
        return lis;
    }
    
    /**
     * @param pasajes the pasajes to set
     */
    public void setPasajes(List<Pasaje> pasajes) {
        this.pasajes = pasajes;
    }
   
    
    public void add_pasaje(Pasaje x){
        getPasajes().add(x);
    }
    
}
