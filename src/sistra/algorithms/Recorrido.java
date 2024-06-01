/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.algorithms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import sistra.TADS.Grafo;
import sistra.clases.Municipio;


public class Recorrido {

    HashSet<Municipio> visitados = new HashSet<>();
    Grafo<Municipio> grafo;
    private final LinkedList<Municipio> recorrido = new LinkedList<>();

    public void Dfs(Grafo<Municipio> grafo, int pos) {
        this.grafo = grafo;
        visitados.clear();
        profundidad(grafo, pos);
    }

    private void profundidad(Grafo<Municipio> grafo, int pos) {
        visitados.add(grafo.obtener_vertice(pos));
        get_recorrido().add(grafo.obtener_vertice(pos));
        List<Municipio> sucesores = grafo.sucesores(pos);
        for (Municipio sucesor : sucesores) {
            int posn = posicion(sucesor);
            if (!visitados.contains(sucesor)) {
                profundidad(grafo, posn);
            }
        }
    }

    private int posicion(Municipio sucesor) {
        for (int i = 0; i < grafo.tamaño(); i++) {
            if (grafo.obtener_vertice(i).equals(sucesor)) {
                return i;
            }
        }
        return -1;
    }

    public void bfs(Grafo<Municipio> grafo, int pos) {
        visitados.clear();
        this.grafo = grafo;
        anchura(pos);
    }

    private void anchura(int pos) {
        LinkedList<Municipio> cola = new LinkedList<>();
        cola.addLast(grafo.obtener_vertice(pos));
        visitados.add(grafo.obtener_vertice(pos));
        while (!cola.isEmpty()) {
            Municipio vertice = cola.removeFirst();
            System.out.println(" " + vertice);
            int po = posicion(vertice);
            List<Municipio> sucesores = grafo.sucesores(pos);
            for (Municipio sucesor : sucesores) {
                if (!visitados.contains(sucesor)) {
                    cola.addLast(sucesor);
                    visitados.add(sucesor);
                }

            }
        }
    }

    /**
     * @return the recorrido
     */
    public LinkedList<Municipio> get_recorrido() {
        return recorrido;
    }

}
