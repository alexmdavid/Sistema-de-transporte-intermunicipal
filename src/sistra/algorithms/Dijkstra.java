/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.algorithms;

import sistra.clases.Municipio;
import java.util.HashSet;
import sistra.TADS.Grafo;

/**
 *
 * @author ALEX DAVID RUIDIAZ C
 */
public class Dijkstra {

    private int d[]; //vector resultante
    private Grafo<Municipio> grafo; //gra
    HashSet<Integer> S = new HashSet<>(); //sin repetir 

    public Dijkstra(Grafo<Municipio> g, int pos) {
        this.grafo = g;
        d = new int[grafo.tamaño()];
        for (int i = 0; i < grafo.tamaño(); i++) {
            if (i != pos) {
                d[i] = grafo.costo_arista(pos, i);
            }
        }
        cminimo(pos);
    }

    private void cminimo(int pos) {
        S.add(pos);
        for (int i = 0; i < grafo.tamaño(); i++) {
            int v = minimo();
            S.add(v);
            for (int w = 0; w < grafo.tamaño(); w++) {
                if (!S.contains(w)) {

                    d[w] = Integer.min(d[w], d[v] + grafo.costo_arista(v, w));

                }

            }

        }
    }

    public int[] getD() {
        return d;
    }

    private int minimo() {
        int men = 999999999;
        int vm = 0;
        for (int i = 0; i < grafo.tamaño(); i++) {
            if (!S.contains(i) && d[i] < men) {
                men = d[i];
                vm = i;
            }
        }
        return vm;
    }
}
