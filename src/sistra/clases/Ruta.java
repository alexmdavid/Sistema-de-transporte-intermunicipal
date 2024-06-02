/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.clases;

import java.io.Serializable;


public class Ruta implements Serializable {
    private String nombre;
    private int distancia; //en kilometros
    private int vi;
    private int vf;

    public Ruta(String nombre, int distancia, int vi, int vf) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.vi = vi;//vertice inicial
        this.vf = vf;//vertice final
    }

    public int getVi() {
        return vi;
    }

    public void setVi(int vi) {
        this.vi = vi;
    }

    public int getVf() {
        return vf;
    }

    public void setVf(int vf) {
        this.vf = vf;
    }

    

    @Override
    public String toString() {
        return ""+nombre ;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
