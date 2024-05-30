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
    private Grafo<Municipio> gra; //gra
    HashSet<Integer> S= new HashSet<>(); //sin repetir 

    

 

    public Dijkstra(Grafo<Municipio> g, int pos) {
        this.gra = g;
        d=new int[gra.tamaño()];
        for (int i = 0; i < gra.tamaño(); i++) {
            if(i!=pos){
                d[i]= gra.costo_arista(pos, i);
            }
        }
        cminimo(pos);  }

    private void cminimo(int pos) {
        S.add(pos); 
        for (int i = 0; i <gra.tamaño(); i++) { 
            int v= minimo();
            S.add(v);
            for (int w = 0; w < gra.tamaño(); w++) {
                if(!S.contains(w)){
                    
                        d[w]= Integer.min(d[w], d[v]+gra.costo_arista(v, w));
                    
                }
  
            }
        
        }
    }

    public int[] getD() {
        return d;
    }

    private int minimo() {
        int men=999999999;
        int vm =0;
        for (int i = 0; i < gra.tamaño(); i++) {
            if(!S.contains(i) && d[i]<men){
                men=d[i];
                vm=i;
            }
        }
        return vm;
    }
    
}
