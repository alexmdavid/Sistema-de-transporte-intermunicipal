/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.logica;

import java.util.Arrays;
import java.util.LinkedList;
import sistra.TADS.Grafo;
import sistra.algorithms.Dijkstra;
import sistra.algorithms.Recorrido;
import sistra.clases.Grafo_dinamico;
import sistra.clases.Municipio;
import sistra.clases.Ruta;

/**
 *
 * @author ALEX DAVID RUIDIAZ C
 */
public class Controlador_general {

    public static void main(String[] args) {
        Grafo<Municipio> gra = new Grafo_dinamico<>();
        Municipio municipio1 = new Municipio("Municipio1", "Capital1", "Terminal1");
        Municipio municipio2 = new Municipio("Municipio2", "Capital2", "Terminal2");
        Municipio municipio3 = new Municipio("Municipio3", "Capital3", "Terminal3");
        Municipio municipio4 = new Municipio("Municipio4", "Capital4", "Terminal4");
        Municipio municipio5 = new Municipio("Municipio5", "Capital5", "Terminal5");
        Municipio municipio6 = new Municipio("Municipio6", "Capital6", "Terminal6");

        Ruta ruta1 = new Ruta("Ruta1", 100, 1, 2);
        Ruta ruta2 = new Ruta("Ruta2", 150, 2, 3);
        Ruta ruta3 = new Ruta("Ruta3", 200, 3, 4);
        Ruta ruta4 = new Ruta("Ruta4", 250, 4, 5);
        Ruta ruta5 = new Ruta("Ruta5", 300, 5, 6);
        Ruta ruta6 = new Ruta("Ruta6", 350, 6, 7);
        Ruta ruta7 = new Ruta("Ruta7", 400, 7, 8);
        Ruta ruta8 = new Ruta("Ruta8", 450, 8, 9);

        gra.insertar_vertice(municipio1);
        gra.insertar_vertice(municipio2);
        gra.insertar_vertice(municipio3);
        gra.insertar_vertice(municipio4);
        gra.insertar_vertice(municipio5);
        gra.insertar_vertice(municipio6);

        gra.insertar_arista(0, 2, ruta1.getDistancia(), ruta1);
        gra.insertar_arista(0, 4, ruta2.getDistancia(), ruta2);
        gra.insertar_arista(1, 2, ruta3.getDistancia(), ruta3);
        gra.insertar_arista(3, 2, ruta4.getDistancia(), ruta4);
        gra.insertar_arista(2, 3, ruta5.getDistancia(), ruta5);
        gra.insertar_arista(4, 0, ruta6.getDistancia(), ruta6);
        gra.insertar_arista(3, 1, ruta7.getDistancia(), ruta7);
        gra.insertar_arista(1, 4, ruta8.getDistancia(), ruta8);

        System.out.println("" + gra.mostrar());

        Recorrido r = new Recorrido();
        r.Dfs(gra, 0);
        System.out.println("" + r.get_recorrido());
        boolean l = verificar_rutas(gra, municipio1, municipio6);
        System.out.println(l);
        Dijkstra dj = new Dijkstra(gra, 0);
        System.out.println(Arrays.toString(dj.getD()));
        int dis = distancia_entre_dos_muns(gra, municipio1, municipio5);
        System.out.println("" + dis);
        boolean con_mas_de_una = conecta_mas_de_una_ruta(gra, municipio1, municipio3);
        System.out.println("" + con_mas_de_una);
        String des = desconectar_municipio(gra, 0, 4);
        System.out.println(""+des);
        Dijkstra d1 = new Dijkstra(gra, 0);
        System.out.println(""+Arrays.toString(d1.getD()));
    }

    public static int buscar_municipio(Grafo<Municipio> g, Municipio mun) {
        for (int i = 0; i < g.tamaño(); i++) {
            if (g.obtener_vertice(i).getNombre().equals(mun.getNombre())) {
                return i;
            }
        }
        return -1;
    }

    public static boolean verificar_rutas(Grafo<Municipio> grafo, Municipio mun1, Municipio mun2) {
        Recorrido rec = new Recorrido();
        int posicion = buscar_municipio(grafo, mun1);
        rec.Dfs(grafo, posicion);
        LinkedList<Municipio> recorrido = rec.get_recorrido();
        for (int i = 0; i < recorrido.size(); i++) {
            if (recorrido.get(i).getNombre().equals(mun2.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public static int distancia_entre_dos_muns(Grafo g, Municipio m1, Municipio m2) {
        int pos_m1 = buscar_municipio(g, m1);
        Dijkstra dj = new Dijkstra(g, pos_m1);
        int v[] = dj.getD();
        int pos_m2 = buscar_municipio(g, m2);
        int distancia_entre_los_dos = v[pos_m2];
        return distancia_entre_los_dos;
    }

    public static boolean encontar_sucesor(Grafo g, Municipio m1, Municipio m2) {
        int pos = buscar_municipio(g, m1);
        LinkedList<Municipio> sucesores = g.sucesores(pos);
        for (Municipio sucesore : sucesores) {
            if (sucesore.getNombre().equals(m2.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public static boolean conecta_mas_de_una_ruta(Grafo g, Municipio m1, Municipio m2) {
        int pos = buscar_municipio(g, m1);
        return verificar_rutas(g, m1, m2) && !encontar_sucesor(g, m1, m2);
    }

    public static String desconectar_municipio(Grafo<Municipio> g, int pos1, int pos2) {
        Municipio m1 = g.obtener_vertice(pos1);
        Municipio m2 = g.obtener_vertice(pos2);
        LinkedList<Municipio> sucesores = g.sucesores(pos1);
        if (conecta_mas_de_una_ruta(g, m1, m2)) {
            return "municipios no conectados directamente";
        } else if (encontar_sucesor(g, m1, m2)) {
            for(int i = 0; i<sucesores.size();i++){
                if(sucesores.get(i).getNombre().equals(m2.getNombre())){
                    g.modificar_arista(pos1, i);
                }
            }
            return "municipio " + m1.getNombre() + " desconectado de municipio " + m2.getNombre();
        }
        return "";
    }
}
