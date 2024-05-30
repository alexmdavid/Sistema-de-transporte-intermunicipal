/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.clases;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author ALEX DAVID RUIDIAZ C
 */
public class Vertice<T> implements Serializable {

    private T vertice;
    private LinkedList<Arista<T>> aristas = new LinkedList<>();

    public Vertice(T vertice) {
        this.vertice = vertice;
    }

    public void add_arista(Arista<T> arista) {
        aristas.add(arista);
    }

    public int costo(int posicion) {
        return aristas.get(posicion).getCosto();
    }

    /**
     * @return the vertice
     */
    public T getVertice() {
        return vertice;
    }

    /**
     * @param vertice the vertice to set
     */
    public void setVertice(T vertice) {
        this.vertice = vertice;
    }

    /**
     * @return the aristas
     */
    public LinkedList<Arista<T>> getAristas() {
        return aristas;
    }

    /**
     * @param aristas the aristas to set
     */
    public void setAristas(LinkedList<Arista<T>> aristas) {
        this.aristas = aristas;
    }

}
