/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.controladores;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import sistra.clases.Ruta;

/**
 *
 * @author ALEX DAVID RUIDIAZ C
 */
public class Rutas_controlador implements Serializable {
     private List<Ruta> rutas;

    public List<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(List<Ruta> rutas) {
        this.rutas = rutas;
    }

    public Rutas_controlador() {
        rutas = new LinkedList<>();
    }
    
    public void add_ruta(Ruta x){
        rutas.add(x);
    }
    
    public String Mostrar_rutas(){
        String lis="";
        for(int i =0; i<rutas.size();i++){
            lis+=(i+1)+" "+rutas.get(i).toString()+"\n";
        }
        return lis;
    }
    
}
