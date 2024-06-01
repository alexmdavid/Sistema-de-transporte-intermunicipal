/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.controladores;


import java.io.Serializable;
import java.util.LinkedList;
import sistra.TADS.Grafo;
import sistra.clases.Grafo_dinamico;
import sistra.clases.Municipio;


public class Municipio_controlador implements Serializable {
    private Grafo<Municipio> municipios;
    

    public Grafo<Municipio> getMunicipios() {
        return municipios;
    }
    
   public LinkedList<Municipio> obtener_municipios(){
    LinkedList<Municipio> muns = new LinkedList<>();
    for(int i = 0; i < municipios.tamaño(); i++){
        muns.add(municipios.obtener_vertice(i));
    }
    return muns;
}


    public void setMunicipios(Grafo<Municipio> municipios) {
        this.municipios = municipios;
    }

    public Municipio_controlador() {
        municipios = new Grafo_dinamico<>();
    }
    
    public void add_municipio(Municipio x){
        municipios.insertar_vertice(x);
    }
    
    public String mostrar_solo_municipios(){
        String lis="";
        for(int i=0;i<municipios.tamaño();i++){
            lis+=i+1+" "+municipios.obtener_vertice(i).toString()+"\n";
        }
        return lis;
    }
    
    
    
}
