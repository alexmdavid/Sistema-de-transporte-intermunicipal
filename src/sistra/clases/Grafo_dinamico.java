/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.clases;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import sistra.TADS.Grafo;


public class Grafo_dinamico<E> implements Grafo<E>, Serializable {

    LinkedList<Vertice<E>> vertices = new LinkedList<>();

    @Override
    public void insertar_vertice(E x) {
        vertices.add(new Vertice<>(x));
    }

    @Override
    public void modificar_arista(int i, int j) {
        vertices.get(i).getAristas().get(j).setCosto(999999999);
        vertices.get(i).getAristas().remove();
    }

    @Override
    public E obtener_vertice(int posicion) {
        for (int i = 0; i < vertices.size(); i++) {
            Vertice<E> vertice_buscado = vertices.get(i);
            if (posicion == i) {
                return vertice_buscado.getVertice();
            }
        }
        return null;
    }

    @Override
    public void insertar_arista(int vertice_inicial, int vertice_final, int costo, Object x) {
        vertices.get(vertice_inicial).add_arista(new Arista<>(obtener_vertice(vertice_final), costo, x));
    }

    @Override
    public int costo_arista(int vertice_inicial, int vertice_final) {
        Vertice ver = vertices.get(vertice_inicial);
        LinkedList<Arista<E>> aristas = ver.getAristas();
        for (int i = 0; i < aristas.size(); i++) {
            Arista<E> aristita = aristas.get(i);
            if (aristita.getSucesor().equals(obtener_vertice(vertice_final))) {
                return (int) aristita.getCosto();
            }

        }
        return 999999999;
    }

    @Override
    public int tamaño() {
        return vertices.size();
    }

    @Override
    public LinkedList<E> sucesores(int posicion) {
        LinkedList<E> sucesores = new LinkedList<>();
        Vertice<E> vertice = vertices.get(posicion);
        LinkedList<Arista<E>> aristas = vertice.getAristas();
        for (int i = 0; i < aristas.size(); i++) {
            sucesores.add(aristas.get(i).getSucesor());
        }
        return sucesores;
    }

    @Override
    public String mostrar() {
        String s = "";
        for (Vertice<E> vertice : vertices) {
            s += "" + vertice.getVertice();
            LinkedList<Arista<E>> aristas = vertice.getAristas();
            for (Arista<E> arista : aristas) {
                s += " apunta a " + arista.getSucesor() + " distancia: " + arista.getCosto()+"km";
            }
            s += "\n";
        }

        return s;
    }

   

}
